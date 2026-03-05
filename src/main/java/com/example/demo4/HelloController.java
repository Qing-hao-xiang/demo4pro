package com.example.demo4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "Hello Railway!");
        return "index";
    }
}
