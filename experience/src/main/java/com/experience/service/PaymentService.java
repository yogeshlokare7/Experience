package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Payment;

@Service
public interface PaymentService {

	public Integer savePayment(Payment payment) throws Exception;

	public Payment updatePayment(Payment payment) throws Exception;

	public void deletePayment(Payment payment) throws Exception;

	public Payment getPayment(Integer paymentId) throws Exception;

	public List<Payment> getPaymentList() throws Exception;
	
}
