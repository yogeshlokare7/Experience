package com.experience.dao;

import java.util.List;

import com.experience.entity.PaymentType;

public interface PaymentTypeDao {

	public Integer savePaymentType(PaymentType paymentType) throws Exception;

	public PaymentType updatePaymentType(PaymentType paymentType) throws Exception;

	public void deletePaymentType(PaymentType paymentType) throws Exception;

	public PaymentType getPaymentType(Integer paymentTypeId) throws Exception;

	public List<PaymentType> getPaymentTypeList() throws Exception;
	
}
