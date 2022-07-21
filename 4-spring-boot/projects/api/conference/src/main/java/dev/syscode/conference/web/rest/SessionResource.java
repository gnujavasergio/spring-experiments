package dev.syscode.conference.web.rest;

import dev.syscode.conference.bean.Session;
import dev.syscode.conference.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SessionResource {


    @Autowired
    private SessionService sessionService;

    @GetMapping("/sessions")
    public List<Session> list() {
        return sessionService.findAll();
    }

    @GetMapping("/sessions/{id}")
    public Session getSession(@PathVariable long id) {
        return sessionService.getSession(id);
    }

    @PostMapping("/sessions")
    public Session create(@RequestBody final Session session) {
        return sessionService.save(session);
    }

    @RequestMapping(value = "/sessions/{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable long id, @RequestBody Session session) {
        return sessionService.update(id, session);
    }

    @RequestMapping(value = "/sessions/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        sessionService.delete(id);
    }
}
