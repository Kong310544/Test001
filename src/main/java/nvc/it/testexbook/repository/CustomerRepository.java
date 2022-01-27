package nvc.it.testexbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.testexbook.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {


    
}
