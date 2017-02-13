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
import universitas.com.model.Dosen;
import universitas.com.service.IDosenSrvc;

/**
 *
 * @author WINDOWS 8
 */
@Controller
public class DosenController {
    
    @Autowired
    IDosenSrvc dosenSrvcService;
    
    @RequestMapping(value = "/InputDosen.do", method = RequestMethod.GET)
    public ModelAndView ShowInput() {

        
        ModelAndView mav = new ModelAndView("InputDosen");
        mav.addObject("dosen", new Dosen());
        return mav;

    }
    
    @RequestMapping(value = "/addDosen.do", method = RequestMethod.POST)
    public String submit(@ModelAttribute("") Dosen dosen, BindingResult result) {
        if (result.hasErrors()) {
            return "/InputDosen";
        }
        dosenSrvcService.Save(dosen);
        return "redirect:/tampilDosen.do";

    }
    
    @RequestMapping(value = "/tampilDosen.do")
    public ModelAndView tampilDosen(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("/Home_Dosen");

        List<Dosen> dosenList = dosenSrvcService.getAllDosen();
        modelAndView.addObject("dosenlist", dosenList);

        return modelAndView;

    }
    
    @RequestMapping(value = "/viewUpdateDosen.do", method = RequestMethod.GET)
    public ModelAndView updateDosen(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("/UpdateDosen");
        Long id_dosen = Long.parseLong(request.getParameter("dosen_id"));
        Dosen dosen = new Dosen();
        try {
            System.out.println("Succes Running");
            dosen = dosenSrvcService.getSingleDosen(id_dosen);
        } catch (Exception e) {
            System.out.print("Not Running");

        }

        modelAndView.addObject(dosen);
        System.out.print("Succes Running");
        return modelAndView;

    }
    
    @RequestMapping(value = "/DeleteDosen.do", method = RequestMethod.GET)
    public String deleteDosen(HttpServletRequest request) {
        Long id_dosen = Long.parseLong(request.getParameter("dosen_id"));
        Dosen dosen = new Dosen();
        dosen.setId_dosen(id_dosen);
        dosenSrvcService.Delete(dosen);
        System.out.println("Succes Running");
        return "redirect:/tampilDosen.do";
    }
    
    @RequestMapping(value = "/searchDosen.do", method = RequestMethod.GET)
    public ModelAndView searchDosen(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/Home_Dosen");
        String nama_dosen = request.getParameter("dosen_nama");
        
        List<Dosen> dosenList = dosenSrvcService.getSearch(nama_dosen);
        modelAndView.addObject("dosenlist", dosenList);

        return modelAndView;
    }
}
