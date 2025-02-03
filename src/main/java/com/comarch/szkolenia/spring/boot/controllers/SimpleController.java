package com.comarch.szkolenia.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@Controller
public class SimpleController {

    @RequestMapping(path = "/test1", method = RequestMethod.GET)
    //@GetMapping("/test1")
    public String test1() {
        System.out.println("cos zadzialalo !!!");
        return "index";
    }

    @RequestMapping(path = "/test2", method = RequestMethod.GET)
    public String test2(@RequestParam(name = "imie", required = false) String name,
                        @RequestParam("nazwisko") String surname,
                        @RequestParam(value = "wiek", required = false) Integer age) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        return "index";
    }

    @RequestMapping(path = "/test3/{imie}/{nazwisko}/{wiek}", method = RequestMethod.GET)
    public String test3(@PathVariable(value = "imie") String name,
                        @PathVariable("nazwisko") String surname,
                        @PathVariable("wiek") String age) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);

        return "index";
    }
}
