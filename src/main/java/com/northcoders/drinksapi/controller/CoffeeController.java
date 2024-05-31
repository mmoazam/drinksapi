package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/")
public class CoffeeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/coffeelover")
    public String getCoffee() {
        return "I Like Coffee";
    }

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        return new Coffee(counter.incrementAndGet(), name);
    }
}
