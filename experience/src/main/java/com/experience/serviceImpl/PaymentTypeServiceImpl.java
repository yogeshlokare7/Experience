package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.PaymentTypeDao;
import com.experience.entity.PaymentType;
import com.experience.service.PaymentTypeService;

@Service
public class PaymentTypeServiceImpl implements PaymentTypeService{
	
	@Autowired
	protected PaymentTypeDao paymentTypeDao;

	public Integer savePaymentType(PaymentType paymentType) throws Exception {
		return paymentTypeDao.savePaymentType(paymentType);
	}

	public PaymentType updatePaymentType(PaymentType paymentType) throws Exception {
		return paymentTypeDao.updatePaymentType(paymentType);
	}

	public void deletePaymentType(PaymentType paymentType) throws Exception {
		paymentTypeDao.deletePaymentType(paymentType);
	}

	public PaymentType getPaymentType(Integer paymentTypeId) throws Exception {
		return paymentTypeDao.getPaymentType(paymentTypeId);
	}

	public List<PaymentType> getPaymentTypeList() throws Exception {
		return paymentTypeDao.getPaymentTypeList();
	}

}
