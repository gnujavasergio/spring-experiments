package dev.syscode.conference.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeResource {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public Map<String, String> getConfig() {
        Map<String, String> values = new HashMap<>();
        values.put("app-version", appVersion);
        return values;
    }
}
