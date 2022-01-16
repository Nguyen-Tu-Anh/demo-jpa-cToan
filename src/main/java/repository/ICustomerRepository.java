package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> fillAll();

    Customer save(Customer customer);

    void delete(Customer customer);

    Customer findById(Long id);

}
