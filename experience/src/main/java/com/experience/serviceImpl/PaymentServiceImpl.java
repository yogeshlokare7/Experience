package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.PaymentDao;
import com.experience.entity.Payment;
import com.experience.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	protected PaymentDao paymentDao;

	public Integer savePayment(Payment payment) throws Exception {
		return paymentDao.savePayment(payment);
	}

	public Payment updatePayment(Payment payment) throws Exception {
		return paymentDao.updatePayment(payment);
	}

	public void deletePayment(Payment payment) throws Exception {
		paymentDao.deletePayment(payment);
	}

	public Payment getPayment(Integer paymentId) throws Exception {
		return paymentDao.getPayment(paymentId);
	}

	public List<Payment> getPaymentList() throws Exception {
		return paymentDao.getPaymentList();
	}
}
