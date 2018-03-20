package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.PaymentDao;
import com.experience.entity.Payment;

@Repository
public class PaymentDaoImpl extends EntityTransactionImpl<Payment> implements PaymentDao {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer savePayment(Payment payment) throws Exception {
		return saveEntity(payment, sessionFactory);
	}

	public Payment updatePayment(Payment payment) throws Exception {
		return updateEntity(payment, sessionFactory);
	}

	public void deletePayment(Payment payment) throws Exception {
		deleteEntity(payment, sessionFactory);
	}

	public Payment getPayment(Integer paymentId) throws Exception {
		return getEntity(new Payment(),paymentId, sessionFactory);
	}

	public List<Payment> getPaymentList() throws Exception {
		return getEntityList(new Payment(), sessionFactory);
	}
	
	

}
