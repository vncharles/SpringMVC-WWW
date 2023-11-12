package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String customerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		
		return "customer-form-confirm";
	}
	
}
