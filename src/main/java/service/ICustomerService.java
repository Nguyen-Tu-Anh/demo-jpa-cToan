package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> fillAll();

    Customer save(Customer customer);

    void delete(Customer customer);

    Customer findById(Long id);
}
