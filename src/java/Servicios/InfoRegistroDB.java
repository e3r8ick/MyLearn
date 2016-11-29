/*
 * To change this license header, choose License Headers in Project Properties.
 * To chge this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import org.springframework.stereotype.Service;
import org.json.simple.*;
/**
 *
 * @author Víctor
 */

@Service
public class InfoRegistroDB {//contiene metodos para obtener la iformacion de las listas de tecnologias,paises, universidades de la bd para mostrar en la pagina de registro
    
    private String user;
    private String pass;
    
    public JSONObject getUniversidades(){
        JSONObject j= new JSONObject();
        JSONArray list = new JSONArray();
        JSONObject j2= new JSONObject();
        JSONObject j3= new JSONObject();
        JSONObject j4= new JSONObject();
        j2.put("ID", "1");
        j2.put("nombre", "TEC");
        j3.put("ID", "2");
        j3.put("nombre", "UNA");
        j4.put("ID", "3");
        j4.put("nombre", "UCR");
        list.add(j2);
        list.add(j3);
        list.add(j4);        
        j.put("ListaUniversidades",list);
        return j;        
    }
    public String getString(){
        String s;
        s="TEC";
        return s;
    }
     public String getString2(){
        String s;
        s="UNA";
        return s;
    }
     
    public String getPass (){
        return pass;
    }
    public String getUser(){
        return user;
    }
     
}


