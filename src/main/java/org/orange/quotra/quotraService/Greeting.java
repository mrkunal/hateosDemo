package org.orange.quotra.quotraService;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Greeting extends Resource {
 
	private final String content;
	
	

}
