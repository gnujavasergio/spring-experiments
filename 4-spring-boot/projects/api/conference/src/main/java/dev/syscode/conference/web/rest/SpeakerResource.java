package dev.syscode.conference.web.rest;

import dev.syscode.conference.bean.Speaker;
import dev.syscode.conference.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SpeakerResource {


    @Autowired
    private SpeakerService speakerService;

    @GetMapping("/speakers")
    public List<Speaker> list() {
        return speakerService.findAll();
    }

    @GetMapping("/speakers/{id}")
    public Speaker getSpeaker(@PathVariable long id) {
        return speakerService.getSpeaker(id);
    }

    @PostMapping("/speakers")
    public Speaker create(@RequestBody final Speaker speaker) {
        return speakerService.save(speaker);
    }

    @PutMapping("/speakers/{id}")
    public Speaker update(@PathVariable long id, @RequestBody Speaker speaker) {
        return speakerService.update(id, speaker);
    }

    @DeleteMapping("/speakers/{id}")
    public void delete(@PathVariable long id) {
        speakerService.delete(id);
    }
}