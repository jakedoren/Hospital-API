package com.jakedoren.Hospital.Controllers;

import com.jakedoren.Hospital.Models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class mainController {

    @GetMapping("/")
    public String hello(){
        return "HI";
    }
}