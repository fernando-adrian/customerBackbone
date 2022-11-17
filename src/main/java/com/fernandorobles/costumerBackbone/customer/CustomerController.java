package com.fernandorobles.costumerBackbone.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    Customer all(){
        return new Customer("Fernando","fernando@gmail.com");
    }
}
