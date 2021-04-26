package com.example.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String test(){
        log.info("아니 왜 안되냐고");
        return "index";
    }

}