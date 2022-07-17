package kkiku.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forum")
public class ForumController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/test")
    public String test() {
        return "home";
    }
}
