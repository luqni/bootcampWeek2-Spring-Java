package com_sti.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

//Kontroler 
@RestController
@RequestMapping("/luqni") //base url untuk mengakses tes
public class App 
{
//	@GetMapping("/tes")
//    String home() {
//        return "Hello luqni!" ;
//    }
	
	@GetMapping("/tes")
    String home1(@RequestParam("data") String data) {
        return "Hello" +data ;
    }
	
	@GetMapping("/tes/{data}")
    public String home(@PathVariable("data") String data) {
        return "Assalamu'alaikum" +data;
    }
}
