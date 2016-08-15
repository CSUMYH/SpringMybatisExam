package com.mao.hand.Dao;

import java.util.List;

import com.mao.hand.Beans.Customer;

public interface CustomerDao {
	public abstract List<Customer> getAllCustomer();
	public abstract void updateCustomer();
	public abstract void InsertCustomer();
	public abstract void deleteCustomer();
}
