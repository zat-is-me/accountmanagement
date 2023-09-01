package com.tatek.accountmanagement.controllers;

import com.tatek.accountmanagement.AccountmanagementApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tatek on 8/30/2023
 */
@RestController
@RequestMapping("/account")
public class Controller {

    @GetMapping("/status")
    public String status(){
        return "<h1>The Application works fine!</h1>";
    }
}