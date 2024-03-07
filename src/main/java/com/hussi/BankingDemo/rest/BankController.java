package com.hussi.BankingDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("/healthcheck")
    public String healthcheck(){
        String res = "BankingDemo is up and running! ==>" + System.currentTimeMillis();
        System.out.println("res ->" + res);
        return res;
    }

    @GetMapping
    public String fallback(){
        String res = "fallback ==>"+System.currentTimeMillis();
        System.out.println("res fallback ->" + res);
        return res;
    }

    @GetMapping
    @RequestMapping("/error")
    public String error(){
        String res = "error ==>"+System.currentTimeMillis();
        System.out.println("res error ->" + res);
        return res;
    }
}
