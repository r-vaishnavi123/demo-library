package com.library.service.library_service.controller;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
 
@RestController

public class SystemController {
 
    @GetMapping("/")

    public String welcome() {

        return "Welcome to Library Management Service";

    }
 
    @GetMapping("/health")

    public String health() {

        return "Library service is UP";

    }
 
    @GetMapping("/info")

    public String info() {

        return "Version 1.0 - 5 collaborator GitHub learning project";

    }

}
 