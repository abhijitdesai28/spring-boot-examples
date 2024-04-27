package com.abhijit.practice.service;

import com.abhijit.practice.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    CustomerModel saveCustomer(CustomerModel customer);
    boolean deleteCustomer(final Long customerId);
    List<CustomerModel> getAllCustomers();
    CustomerModel getCustomerById(final Long customerId);
}
