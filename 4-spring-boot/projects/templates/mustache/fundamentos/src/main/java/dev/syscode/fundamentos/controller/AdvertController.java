package dev.syscode.fundamentos.controller;

import dev.syscode.fundamentos.bean.Advert;
import dev.syscode.fundamentos.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        List<Advert> adverts = advertService.findAll();
        Advert advert = new Advert();
        advert.setName(name);
        advert.setSubject(subject);
        advert.setComment(comment);
        model.addAttribute("adverts", adverts);
        return "advert/list";
    }

    @PostMapping("save")
    public String save(Model model, Advert advert) {
        List<Advert> adverts = advertService.findAll();
        adverts.add(advert);
        model.addAttribute("adverts", adverts);
        return "advert/list";
    }
}
