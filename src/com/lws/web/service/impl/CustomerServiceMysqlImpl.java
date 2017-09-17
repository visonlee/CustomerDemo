package com.lws.web.service.impl;

import com.lws.web.bean.Customer;
import com.lws.web.dao.CustomerDAO;
import com.lws.web.dao.impl.CustomerDAOMysqlImpl;
import com.lws.web.service.CustomerService;

import java.util.List;

/**
 * Created by slpay on 17/09/2017.
 */
public class CustomerServiceMysqlImpl implements CustomerService {

    private CustomerDAO dao = new CustomerDAOMysqlImpl();

    @Override
    public List<Customer> findAllCustomers() {
        return dao.findAll();
    }

    @Override
    public Customer findCustomerById(String customerId) {
        if (customerId == null || customerId.length() == 0) {
            throw new IllegalArgumentException("The param customerId can not be empty");
        }

        return dao.findById(customerId);
    }

    @Override
    public void addCustomer(Customer c) {
         dao.save(c);
    }

    @Override
    public void updateCustomer(Customer c) {
        dao.update(c);
    }

    @Override
    public void deleteCustomerById(String customerId) {
        if (customerId == null || customerId.length() == 0) {
            throw new IllegalArgumentException("The param customerId can not be empty");
        }

        dao.deleteById(customerId);
    }
}
