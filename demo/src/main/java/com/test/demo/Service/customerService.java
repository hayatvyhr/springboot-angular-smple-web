package com.test.demo.Service;

import com.test.demo.DTO.CustomerDTO;
import com.test.demo.DTO.customerSavedto;
import com.test.demo.DTO.customerUpdateDto;
import com.test.demo.DTO.orderDto;


import java.util.List;

public interface customerService {

   int makeOrder(orderDto orderDto);

    String addCustomer(customerSavedto customerSavedto);

    List<CustomerDTO> getAll();

    String UpdteCustomer(customerUpdateDto customerUpdatedto);

    boolean deleteCustomer(int id);
}
