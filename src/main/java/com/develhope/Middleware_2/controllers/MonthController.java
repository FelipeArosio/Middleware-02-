package com.develhope.Middleware_2.controllers;

import com.develhope.Middleware_2.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {

    @GetMapping("/months")
    public Month getMonth(@RequestAttribute Month month) {
        return month;
    }
}

