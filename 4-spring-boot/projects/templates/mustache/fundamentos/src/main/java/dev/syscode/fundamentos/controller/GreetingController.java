package dev.syscode.fundamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(Model model) {
        model.addAttribute("name", "Sergio");
        return "greet/show";
    }

    @PostMapping("/show")
    public String show(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "greet/show";
    }

    @GetMapping("/edit")
    public String edit() {
        return "greet/edit";
    }
}
