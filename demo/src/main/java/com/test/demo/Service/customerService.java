package com.test.demo.Service;

import com.test.demo.DTO.CustomerDTO;
import com.test.demo.DTO.customerSavedto;
import com.test.demo.DTO.customerUpdateDto;

import java.util.List;

public interface customerService {
    String addCustomer(customerSavedto customerSavedto);

    List<CustomerDTO> getAll();

    String UpdteCustomer(customerUpdateDto customerUpdatedto);

    boolean deleteCustomer(int id);
}
