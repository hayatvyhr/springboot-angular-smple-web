package com.test.demo.Service;

import com.test.demo.DTO.CustomerDTO;
import com.test.demo.DTO.customerSavedto;
import com.test.demo.DTO.customerUpdateDto;
import com.test.demo.DTO.orderDto;
import com.test.demo.customerRepo.CustomerRepo;
import com.test.demo.customerRepo.OrderRepo;
import com.test.demo.entity.Customer;
import com.test.demo.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class customerServiceIMPL implements customerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public int makeOrder(orderDto orderDto) {
        Customer customer = customerRepo.findById(orderDto.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Order order = new Order();
        order.setItem(orderDto.getItem());
        order.setDate(orderDto.getDate());
        order.setQuantity(orderDto.getQuantity());

        order.setCustomer(customer);

        orderRepo.save(order);

        return order.getId_order();
    }


    @Override
    public String addCustomer(customerSavedto customerSavedto) {
        Customer customer = new Customer(

                customerSavedto.getCusaddress(),
                customerSavedto.getCusname(),
                customerSavedto.getMobile()

                );
        customerRepo.save(customer);
        return customer.getCusname() + customer.getCusaddress() + customer.getMobile();
    }

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customerList = customerRepo.findAll();
        List<CustomerDTO> dtoList = new ArrayList<CustomerDTO>();
        for (Customer customer : customerList) {
            CustomerDTO  customerDTO = new CustomerDTO(
                    customer.getId(),
                    customer.getCusaddress(),
                    customer.getMobile(),
                    customer.getCusname()

                    );

            dtoList.add(customerDTO);

        }
        return dtoList;
    }

    @Override
    public String UpdteCustomer(customerUpdateDto customerUpdatedto) {
        if (customerRepo.existsById(customerUpdatedto.getId())) {
            Customer customer = customerRepo.findById(customerUpdatedto.getId()).get();
                    customer.setCusaddress(customerUpdatedto.getCusaddress());
                    customer.setCusname(customerUpdatedto.getCusname());
            customer.setMobile(customerUpdatedto.getMobile());


            customerRepo.save(customer);

        }
        else{
            System.out.println("ghaleb lah makaynx");
        }


        return null;

    }

    @Override
    public boolean deleteCustomer(int id) {
        if(customerRepo.existsById(id)) {
            customerRepo.deleteById(id);

        }
        else {
            System.out.println("not found");
        }
        return true;
    }


}
