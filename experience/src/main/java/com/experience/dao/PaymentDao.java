package com.experience.dao;

import java.util.List;

import com.experience.entity.Payment;

public interface PaymentDao {

	public Integer savePayment(Payment payment) throws Exception;

	public Payment updatePayment(Payment payment) throws Exception;

	public void deletePayment(Payment payment) throws Exception;

	public Payment getPayment(Integer paymentId) throws Exception;

	public List<Payment> getPaymentList() throws Exception;
	
}
