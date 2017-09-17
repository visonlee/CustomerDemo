package com.lws.web.dao;

import com.lws.web.bean.Customer;

import java.util.List;

/**
 * Created by slpay on 17/09/2017.
 */
public interface CustomerDAO {

    /**
     * 查找全部的Customer
     * @return 没有数据返回null
     */
    public List<Customer> findAll();

    /**
     * 根据ID查找customer
     * @param id
     * @return 如果没有找到返回null
     */
    public Customer findById(String id);

    /**
     * 添加客户
     * @param c
     */
    public void save(Customer c);

    /**
     * 更新customer
     * @param c
     */
    public void update(Customer c);

    /**
     * 根据id删除customer
     * @param id
     */
    public void deleteById(String id);

}
