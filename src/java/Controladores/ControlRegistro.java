/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Servicios.InfoRegistroDB;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Víctor
 */
@Controller
public class ControlRegistro {
    private HashMap<String,String> model;
    
    
    
    @RequestMapping("ControlMostrarRegistro.htm") 
    protected ModelAndView ControlMostrarRegistro(@ModelAttribute InfoRegistroDB universidades){
        ModelAndView model=new ModelAndView();
        model.setViewName("register");
        
        
        
        return model ;
    }
    
}
