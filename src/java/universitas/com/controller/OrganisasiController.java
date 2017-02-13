/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import universitas.com.model.Organisasi;
import universitas.com.service.IOrganisasiSrvc;

/**
 *
 * @author WINDOWS 8
 */
@Controller
public class OrganisasiController {
    @Autowired
    IOrganisasiSrvc organisasiService;
    
    @RequestMapping(value = "/InputOrganisasi.do", method = RequestMethod.GET)
    public ModelAndView ShowInput() {

        
        ModelAndView mav = new ModelAndView("InputOrganisasi");
        mav.addObject("organisasi", new Organisasi());
        return mav;

    }
    
    @RequestMapping(value = "/addOrganisasi.do", method = RequestMethod.POST)
    public String submit(@ModelAttribute("") Organisasi organisasi, BindingResult result) {
        if (result.hasErrors()) {
            return "/InputOrganisasi";
        }
        organisasiService.Save(organisasi);
        return "redirect:/tampilOrganisasi.do";

    }
    
    @RequestMapping(value = "/tampilOrganisasi.do")
    public ModelAndView tampilOrganisasi(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("/Home_Organisasi");

        List<Organisasi> organisasiList = organisasiService.getAllOrganisasi();
        modelAndView.addObject("organisasilist", organisasiList);

        return modelAndView;

    }
    
    @RequestMapping(value = "/viewUpdateOrganisasi.do", method = RequestMethod.GET)
    public ModelAndView updateOrganisasi(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("/UpdateOrganisasi");
        Long id_organisasi = Long.parseLong(request.getParameter("organisasi_id"));
        Organisasi organisasi = new Organisasi();
        try {
            System.out.println("Succes Running");
            organisasi = organisasiService.getSingleOrganisasi(id_organisasi);
        } catch (Exception e) {
            System.out.print("Not Running");

        }

        modelAndView.addObject(organisasi);
        System.out.print("Succes Running");
        return modelAndView;

    }

    @RequestMapping(value = "/DeleteOrganisasi.do", method = RequestMethod.GET)
    public String deleteOrganisasi(HttpServletRequest request) {
        Long id_organisasi = Long.parseLong(request.getParameter("organisasi_id"));
        Organisasi organisasi = new Organisasi();
        organisasi.setId_organisasi(id_organisasi);
        organisasiService.Delete(organisasi);
        System.out.println("Succes Running");
        return "redirect:/tampilMahasiswa.do";
    }
    
    @RequestMapping(value = "/searchOrganisasi.do", method = RequestMethod.GET)
    public ModelAndView searchOrganisasi(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/Home_Organisasi");
        String nama_ketua = request.getParameter("organisasi_nama");
        
        List<Organisasi> organisasiList = organisasiService.getSearch(nama_ketua);
        modelAndView.addObject("organisasilist", organisasiList);

        return modelAndView;
    }
    
}
