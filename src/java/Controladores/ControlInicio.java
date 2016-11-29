/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Entidades_de_Transferencia_de_Informacion.Tupla;
import Servicios.AdministradorDeCuentas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Víctor
 */
@Controller
public class ControlInicio {
    
    
    @RequestMapping(value="ControlMostrarInicio" ,method= RequestMethod.GET)
    public ModelAndView ControlMostrarInicio(HttpServletRequest arg1,HttpServletResponse arg2) {
        ModelAndView model=new ModelAndView();
        model.setViewName("index");
        return model;
    }
    @RequestMapping(value="ControlValidarUsuario",method= RequestMethod.POST)
    public ModelAndView ControlValidarUsuario(HttpServletRequest req,HttpServletResponse res){
        ModelAndView model=new ModelAndView();
        model.addObject("message", "No se ha capturado el usuario o contrasenia");
        AdministradorDeCuentas admin = new AdministradorDeCuentas();
        String userName="";
        String passWord="";
        
        if (req != null) {
            if (!req.getParameter("user").isEmpty() && !req.getParameter("pass").isEmpty()) {
                userName = req.getParameter("user");
                passWord = req.getParameter("pass");
                Tupla t =admin.validarUsuario(userName, passWord);
                
                if (t.getTipo().equals("no existe")) {
                    model.setViewName("indexFallo");
                } 
                else if(t.getTipo().equals("estudiante")) {
                    model.setViewName("perfilEstudiante");
                    }
                else if(t.getTipo().equals("profesor")) {
                    model.setViewName("perfiProfesor");
                    }
                else if(t.getTipo().equals("empresa")) {
                    model.setViewName("perfiEmpresa");
                    }
            }
        }
        model.addObject("pass",passWord);
        model.addObject("user",userName);
            //model.addObject("pass", req.getParameter("pass"));
            //model.addObject("user", req.getParameter("user"));
            
            
        
        return model;
    }
    
}
