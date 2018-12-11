package com_sti.bootcamp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//Kontroler 
@RestController
@RequestMapping("/local") //base url untuk mengakses tes
public class App 
{
//	@GetMapping("/tes")
//    String home() {
//        return "Hello luqni!" ;
//    }
	
//	@GetMapping("/tes")
//    String home(@RequestParam("data") String data) {
//        return "Hello" +data ;
//    }
//	
//	@GetMapping("/tes/{data}")
//    public String homePathVariable(@PathVariable("data") String data) {
//        return "Assalamu'alaikum " +data;
//    }
	@GetMapping("/custumer/{id}")
	public Customer Createcustomer(@PathVariable ("id") String customerNumber) {
		Customer cs = new Customer();
		cs.setCustomerNumber(Integer.parseInt(customerNumber));
		cs.setFirstName("luqni");
		cs.setLastName("Baehaqi");
		cs.setPhoneNumber("0874557732378");
		cs.setPhoneType("Android");
		return cs;
	}
	
	@PostMapping("/customer")
	public String addCostumer(@RequestBody Customer customer) {
		return "hello" + customer.getFirstName();
	}
	@PutMapping("/customer")
	public String PuCustomert(@RequestBody Customer customer) {
//		Customer cs = new Customer();
//		cs.getCustomerNumber()
//		return "hello" + customer.getFirstName();
		return customer.getFirstName();
	}
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable ("id") String customerNumber) {
		Customer cs = new Customer();
		cs.setCustomerNumber(Integer.parseInt(customerNumber));
		return customerNumber;
		
	}public List<Customer> getList(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		return list;
	}
	
	
	
}
