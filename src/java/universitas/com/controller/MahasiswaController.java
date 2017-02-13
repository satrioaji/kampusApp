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
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import universitas.com.model.Mahasiswa;
import universitas.com.service.IMahasiswaSrvc;

/**
 *
 * @author WINDOWS 8
 */
@Controller
public class MahasiswaController {

    @Autowired
    IMahasiswaSrvc mahasiswaService;

//    @RequestMapping(value = "/InputMahasiswa.do",method =RequestMethod.GET)
//    public String showInput(Model model){
//        model.addAttribute("mahasiswa",new Mahasiswa());
//        return "InputMahasiswa";
    // }
    @RequestMapping(value = "/InputMahasiswa.do", method = RequestMethod.GET)
    public ModelAndView ShowInput() {

        //return new ModelAndView ("mahasiswa","InputMahasiswa",new Mahasiswa());
        ModelAndView mav = new ModelAndView("InputMahasiswa");
        mav.addObject("mahasiswa", new Mahasiswa());
        return mav;

    }

    @RequestMapping(value = "/addMahasiswa.do", method = RequestMethod.POST)
    public String submit(@ModelAttribute("") Mahasiswa mahasiswa, BindingResult result,
            ModelMap map) {
        if (result.hasErrors()) {
            return "/InputMahasiswa.do";
        }
        map.addAttribute("mahasiswa", mahasiswa.getNpm());

        mahasiswaService.Save(mahasiswa);
        return "redirect:/tampilMahasiswa.do";

    }

    @RequestMapping(value = "/tampilMahasiswa.do")
    public ModelAndView tampilMahasiswa(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("/Home");

        List<Mahasiswa> mahasiswaList = mahasiswaService.getAllMahasiswa();
        modelAndView.addObject("mahasiswalist", mahasiswaList);

        return modelAndView;

    }

    @RequestMapping(value = "/viewUpdate.do", method = RequestMethod.GET)
    public ModelAndView updateMahasiswa(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("/UpdateMahasiswa");
        Long id = Long.parseLong(request.getParameter("mhs_id"));
        Mahasiswa mhs = new Mahasiswa();
        try {
            System.out.println("Succes Running");
            mhs = mahasiswaService.getSingleMahasiswa(id);
        } catch (Exception e) {
            System.out.print("Not Running");

        }

        modelAndView.addObject(mhs);
        System.out.print("Succes Running");
        return modelAndView;

    }

    @RequestMapping(value = "/DeleteMahasiswa.do", method = RequestMethod.GET)
    public String deleteMahasiswa(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("mhs_id"));
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(id);
        mahasiswaService.Delete(mahasiswa);
        System.out.println("Succes Running");
        return "redirect:/tampilMahasiswa.do";
    }

    @RequestMapping(value = "/searchMahasiswa.do", method = RequestMethod.GET)
    public ModelAndView searchMahasiswa(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/Home");
        String nama = request.getParameter("mhs_nama");
        
        List<Mahasiswa> mahasiswaList = mahasiswaService.getSearch(nama);
        modelAndView.addObject("mahasiswalist", mahasiswaList);

        return modelAndView;
    }
}
