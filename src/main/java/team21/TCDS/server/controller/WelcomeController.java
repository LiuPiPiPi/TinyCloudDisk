package team21.TCDS.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping({"/"})
    public String home() {
        return "redirect:/home.html";
    }

}
