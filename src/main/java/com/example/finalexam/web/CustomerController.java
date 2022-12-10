package com.example.finalexam.web;
import com.example.finalexam.entities.Customer;
import com.example.finalexam.repositories.CustomerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//https://github.com/josmar29/finalExam

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

    @PostMapping(path = "/save")
    public String save(Model model, Customer customer, BindingResult bindingResult,  HttpSession session) {
        if (bindingResult.hasErrors()) {
            return "editCustomers";
        } else {
            customerRepository.save(customer);


            return "redirect:index";
        }
    }


}
