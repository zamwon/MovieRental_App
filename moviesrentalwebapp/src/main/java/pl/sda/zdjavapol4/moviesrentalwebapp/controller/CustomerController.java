package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.CustomerService;

@Slf4j
@Controller
public class CustomerController {

    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
}
