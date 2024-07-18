package com.test.demo.customerController;

import com.test.demo.DTO.CustomerDTO;
import com.test.demo.DTO.customerSavedto;
import com.test.demo.DTO.customerUpdateDto;
import com.test.demo.Service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class customerController {
    @Autowired
      private customerService customerservice ;
    @PostMapping(path ="/save")
    public String saveCustomer(@RequestBody customerSavedto customerSavedto) {
        String id = customerservice.addCustomer(customerSavedto);
        return id;
    }
    @GetMapping(path ="/get")
    public List<CustomerDTO> getCustomer() {
          List<CustomerDTO> dt = customerservice.getAll();
          return dt;
    }
    @PutMapping(path ="/update")
    public String updateCustomer(@RequestBody customerUpdateDto customerUpdatedto ) {
        String id = customerservice.UpdteCustomer(customerUpdatedto);
        return id;
    }
    @DeleteMapping(path ="/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id ) {
        boolean deletecus = customerservice.deleteCustomer(id);
        return "deleted";
    }

}
