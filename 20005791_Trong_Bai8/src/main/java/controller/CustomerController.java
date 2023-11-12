package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CustomerDAO;
import entity.Customer;
import service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homeCustomer(Model model) {
		List<Customer> list = customerService.getAll();
		
		model.addAttribute("customers", list);
		
		return "home-customer";
	}
	
	@RequestMapping(value = "/showFormForUpdate", method = RequestMethod.GET)
	public String showFormForUpdate(@RequestParam("customerId")int id, Model model) {
		Customer customer = customerService.getDetail(id);
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@RequestMapping(value =  "/showFormForAdd", method = RequestMethod.GET)
	public String showFormForAdd(Model model) {
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("customerId")int id) {
		customerService.delete(id);
		
		return "redirect:/customer/";
	}
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String save(@ModelAttribute("customer") Customer customer) {
		customerService.save(customer);
		System.out.println("ID: " + customer.getId());
		return "redirect:/customer/";
	}
}
