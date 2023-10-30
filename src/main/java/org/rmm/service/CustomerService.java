package org.rmm.service;

import org.rmm.entity.Customer;
import org.rmm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends GenericService<Customer , CustomerRepository> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }
}
