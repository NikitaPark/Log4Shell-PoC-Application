package com.nikitapark.log4shellpocapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
public class VulnController {
    Logger logger = LogManager.getLogger(VulnController.class);

    @GetMapping("/vuln")
    public String vulnEndpoint(@RequestHeader(value = "X-Api-Key", required = false) String apiKey) {

        logger.info(apiKey);
        return String.format("X-Api-Key: %s", apiKey);
    }
}
