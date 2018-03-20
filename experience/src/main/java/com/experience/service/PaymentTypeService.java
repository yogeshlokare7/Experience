package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.PaymentType;

@Service
public interface PaymentTypeService {

	public Integer savePaymentType(PaymentType paymentType) throws Exception;

	public PaymentType updatePaymentType(PaymentType paymentType) throws Exception;

	public void deletePaymentType(PaymentType paymentType) throws Exception;

	public PaymentType getPaymentType(Integer paymentTypeId) throws Exception;

	public List<PaymentType> getPaymentTypeList() throws Exception;
	
}
