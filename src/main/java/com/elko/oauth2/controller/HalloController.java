/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.elko.oauth2.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Elko
 */
@Controller
public class HalloController {
    
    @RequestMapping("/halo")
    public void halo(Model m){
        m.addAttribute("waktu",new  Date());
        
    }
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello elko";
    }
}
