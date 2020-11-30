package time43.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String frontPage() {
        return "front-page";
    }

    @GetMapping("/identificacao")
    public String identificacao() {
        return "identification";
    }

}
