package com.cicdtest.shiv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
 @GetMapping
    public String hello(){
     return "lets go phase 3";
 }

}
