package org.rmm.controller;

import org.rmm.entity.Customer;
import org.rmm.repository.CustomerRepository;
import org.rmm.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer/")
public class CustomerController extends GenericController<CustomerService , Customer , CustomerRepository>{
    public CustomerController(CustomerService service) {
        super(service);
    }
}
