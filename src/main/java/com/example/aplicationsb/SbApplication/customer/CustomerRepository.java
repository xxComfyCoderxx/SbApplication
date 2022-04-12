package com.example.aplicationsb.SbApplication.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Reponsible for Data Access
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // SELECT * FROM customer WHERE email = ?
    //OR
    //@Query("SELECT c FROM Customer c WHERE c.email = ?1")
    Optional<Customer> findCustomerByEmail(String email);
}
