package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // обозначает этот класс REST контроллером
public class MyController {

    @GetMapping("/text") //создает END эндпойнт
    public String getText() {
        return "когда то и меня вела дорога приключений а потом мне прострелили колено";
    }

    @GetMapping("/number") // создает второй END эндпойтн
    public int getNumber() {
        return 13;
    }
}