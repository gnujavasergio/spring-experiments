package dev.syscode.mustacheusers.controller;

import dev.syscode.mustacheusers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/count")
    public String getCount(Model model) {
        model.addAttribute("count", userService.getCount());
        return "user_count";
    }
}
