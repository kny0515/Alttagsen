package org.alttagsen.hotel.main.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index" ;
    }

    @GetMapping("/error/denied")
    public String errorDenied(){

        return "error/denied" ;
    }
}
