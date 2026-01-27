package com.jenkins.file_integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsFileIntegrationRestController {

    @GetMapping
    public String message(){
        return "welcome";
    }
}
