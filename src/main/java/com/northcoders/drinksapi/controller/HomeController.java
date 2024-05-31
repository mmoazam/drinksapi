package com.northcoders.drinksapi.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome to the Drinks API!";
    }


}//end class
