package ru.sinakaev.springcourse.task18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.sinakaev.springcourse.task18.entity.Customer;
import ru.sinakaev.springcourse.task18.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Customer> theCustomers = customerService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "instructors-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "instructors-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
        Customer theCustomer = customerService.getCustomer(theId);
        theModel.addAttribute("customer", theCustomer);
        return "instructors-form";
    }

}
