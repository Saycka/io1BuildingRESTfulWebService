package com.manyatkin.springioex.BuildingRESTfulWebService.controller;

import com.manyatkin.springioex.BuildingRESTfulWebService.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    private static String CONTENT = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    //    @RequestMapping("/greeting")
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
//    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(CONTENT, name));
    }
}
