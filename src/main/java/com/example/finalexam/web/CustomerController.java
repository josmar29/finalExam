package com.example.finalexam.web;
import com.example.finalexam.entities.Customer;
import com.example.finalexam.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping(path = "/index")
    public String customers(Model model) {

        List<Customer> customers = customerRepository.findAll();

        model.addAttribute("listCustomers", customers);

        return "customers";
    }

//    @GetMapping("/add")
//    public String formStudents(Model model) {
//        model.addAttribute("student", new Customer());
//        return "redirect:/customers";
//    }


}
