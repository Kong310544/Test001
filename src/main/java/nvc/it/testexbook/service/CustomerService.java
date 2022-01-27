package nvc.it.testexbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.testexbook.model.Customer;
import nvc.it.testexbook.repository.CustomerRepository;

@Service
public class CustomerService  {
    @Autowired
    CustomerRepository customerRepository;


     public List<Customer> findAll(){
         return customerRepository.findAll();
     }


     //
     public Customer getById(int id){
         return customerRepository.getById(id);
     }
}

