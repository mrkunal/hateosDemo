package org.orange.quotra.quotraService;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
public class ApplicationController {

	
	@RequestMapping("/greeting")
	public HttpEntity<Greeting> greeting(@RequestParam(value="name",required=false,defaultValue="World") String name){
		
		 Greeting greeting = new Greeting("Hello World");
	        greeting.add(linkTo(methodOn(ApplicationController.class).greeting(name)).withSelfRel());

	        return new ResponseEntity<>(greeting, HttpStatus.OK);	
	}
	
}
