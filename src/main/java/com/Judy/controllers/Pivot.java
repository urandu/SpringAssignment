package com.Judy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by urandu on 5/7/15.
 */

@Controller
public class Pivot {
    @RequestMapping("/")

    public String welcome()
    {
        return "patients";
    }
}
