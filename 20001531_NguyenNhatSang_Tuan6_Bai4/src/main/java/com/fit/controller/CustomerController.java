package com.fit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fit.entities.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		return new ModelAndView("Customer-form", "customer", new Customer());
	}
	
	@RequestMapping("/processForm")
	public ModelAndView processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return new ModelAndView("Customer-form", "customer", customer);
		return new ModelAndView("Customer-confirmation", "customer", customer);
	}
}
