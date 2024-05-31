package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/tea")
public class TeaController {

    private final AtomicLong teaCounter = new AtomicLong();

    @GetMapping("/tealover")
    public String tea() {
        return "I like tea!";
    }

    @GetMapping("/teaorder")
    public Tea teaOrder(@RequestParam(value = "name", defaultValue = "green tea") String name) {
        return new Tea(teaCounter.incrementAndGet(), name);
    }

}
