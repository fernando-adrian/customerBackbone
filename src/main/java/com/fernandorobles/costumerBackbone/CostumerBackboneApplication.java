package com.fernandorobles.costumerBackbone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CostumerBackboneApplication {

	public static void main(String[] args) {

		SpringApplication.run(CostumerBackboneApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(@RequestParam(value="message", defaultValue = "world") String message){
		return String.format("Hello %s!", message);
	}

}
