package com.nirmal.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Value("${message}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String getLuckyWord(){
        return luckyWord;
    }

}
