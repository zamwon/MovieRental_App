package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.CustomerService;


@Slf4j
@Controller
public class CustomerController {

    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping({"/customers"})
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.getAll());
        return "customers/index";
    }

    @RequestMapping(value = "/customer/delete")
    public String deleteCustomer(@RequestParam Customer id, Model model){
        customerService.delete(id);
        return "redirect:/customers";
    }

    @GetMapping({"/addNewCustomer"})
    public String newCustomer(Model model) {
        model.addAttribute("user", new Customer());

        return "customers/add";
    }

    @PostMapping("/save-customer")
    public String saveOrUpdate(@ModelAttribute Customer customer){
        customerService.save(customer);

        return "redirect:/customers";
    }
}
