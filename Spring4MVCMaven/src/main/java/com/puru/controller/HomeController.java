package com.puru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PurushothA on 7/4/2019.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "Testing first";
    }
}
