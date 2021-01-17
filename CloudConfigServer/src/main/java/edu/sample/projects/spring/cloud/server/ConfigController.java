package edu.sample.projects.spring.cloud.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/property")
    public String getPropertyValue(@RequestParam String property) {
        return env.getProperty(property);
    }
}
