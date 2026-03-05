package com.example;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "这里是秦浩翔的个人网页");
        return "index";
    }
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "你好";
    }
}