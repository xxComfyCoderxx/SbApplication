package com.example.aplicationsb.SbApplication.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
            Customer mark = new Customer(
                    "Mark",
                    "markwinner@gmail.com",
                    LocalDate.of(2000, AUGUST, 5)
                    );
            Customer tory = new Customer(
                    "Tory",
                    "ToryLanezs@gmail.com",
                    LocalDate.of(1991, AUGUST, 8)
                    );
            //Saving students to DB
            repository.saveAll(
                    List.of(tory, mark));
        };

    }
}
