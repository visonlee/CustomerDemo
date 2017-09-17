package com.lws.web.service;

import com.lws.web.bean.Customer;

import java.util.List;

/**
 * Created by slpay on 17/09/2017.
 */
public interface CustomerService {

    /**
     * 查找全部的Customer
     * @return 没有数据返回null
     */
    public List<Customer> findAllCustomers();

    /**
     * 根据ID查找customer
     * @param customerId
     * @return 如果没有找到返回null
     */
    public Customer findCustomerById(String customerId);

    /**
     * 添加客户
     * @param c
     */
    public void addCustomer(Customer c);

    /**
     * 更新customer
     * @param c
     */
    public void updateCustomer(Customer c);

    /**
     * 根据id删除customer
     * @param customerId
     */
    public void deleteCustomerById(String customerId);

}
