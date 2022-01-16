package service;

import model.Customer;
import repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    ICustomerRepository customerRepository;
    @Override
    public List<Customer> fillAll() {
            return customerRepository.fillAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }
}
