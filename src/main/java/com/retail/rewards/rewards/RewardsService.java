package com.retail.rewards.rewards;

import com.retail.rewards.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RewardsService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

//	public ResponseEntity<Customer> getCustomerById(Integer customerId) {
//		Customer customer = customerRepository.findById(customerId).orElse(null);
//		return new ResponseEntity<Customer>(customer, HttpStatus.NOT_FOUND);
//	}

}