package com_sti.bootcamp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("\tes")

public class GenericEntityController {

    @GetMapping(value = "/helo")
	public String hello(){
		return "hello";
	}
	 
    
 


}
