package com.coderscamp.unit15.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("")
    public String getRootWebpage (ModelMap model) {

        String firstName = "Trevor";
        model.put("firstname", firstName);
        return "welcome";
    }
}
