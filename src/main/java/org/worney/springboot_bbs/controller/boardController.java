package org.worney.springboot_bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class boardController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
