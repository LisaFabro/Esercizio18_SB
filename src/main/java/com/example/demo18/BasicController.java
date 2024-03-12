package com.example.demo18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class BasicController {
    @GetMapping
    public int sum(){
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        return num1 + num2;
    }
}
