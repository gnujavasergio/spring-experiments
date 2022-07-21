package dev.syscode.fundamentos.controller;

import dev.syscode.fundamentos.bean.Advert;
import dev.syscode.fundamentos.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("adverts")
public class AdvertController {

    @Autowired
    private AdvertService advertService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("adverts", advertService.findAll());
        return "advert/list";
    }

    @GetMapping("create/get")
    public String getCreate() {
        return "advert/getCreate";
    }

    @GetMapping("create/post")
    public String postCreate() {
        return "advert/postCreate";
    }

    @GetMapping("save")
    public String save(Model model, @RequestParam String name, @RequestParam String subject, @RequestParam String comment) {
        advertService.save(name, subject, comment);
        model.addAttribute("adverts", advertService.findAll());
        return "advert/list";
    }

    @PostMapping("save")
    public String save(Model model, Advert advert) {
        advertService.save(advert);
        model.addAttribute("adverts", advertService.findAll());
        return "redirect:/adverts";
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        Advert advert = advertService.findById(id);
        model.addAttribute("advert", advert);
        return "advert/edit";
    }

    @PostMapping("update")
    public String update(Model model, Advert advert) {
        advertService.update(advert);
        model.addAttribute("adverts", advertService.findAll());
        return "redirect:/adverts";
    }
}
