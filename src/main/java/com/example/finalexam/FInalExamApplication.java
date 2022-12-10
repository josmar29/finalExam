package com.example.finalexam;

import com.example.finalexam.entities.Customer;
import com.example.finalexam.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class FInalExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(FInalExamApplication.class, args);
	}

//	    @Bean
//		CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
//        return args -> {
//			customerRepository.save(new Customer(null, new Date(), "1B", "Efi"));
//			customerRepository.save(new Customer(null, new Date(), "4B", "Mar"));
//
//			customerRepository.findAll().forEach(p->{
//                System.out.println(p.getSeatNum());
//				System.out.println(p.getDate());
//				System.out.println(p.getId());
//				System.out.println(p.getName());
//            });
//        };
//    }

}
