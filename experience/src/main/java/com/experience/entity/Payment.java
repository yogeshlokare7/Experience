package com.experience.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {

	@Column(name = "payment_id")
	Integer paymentId;

	@Column(name = "bank_name")
	String bankName;

	@Column(name = "bank_account_no")
	Integer bankAccountNo;

	@Column(name = "check_no")
	String checkNo;

	@Column(name = "credit_card_no")
	Integer creditCardNo;

	@Column(name = "debit_card_no")
	Integer debitCardNo;

	@Column(name = "amount")
	Integer amount;

	@Column(name = "date")
	Date date;

	@Column(name = "description")
	String description;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Integer getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(Integer bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public Integer getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(Integer creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public Integer getDebitCardNo() {
		return debitCardNo;
	}

	public void setDebitCardNo(Integer debitCardNo) {
		this.debitCardNo = debitCardNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	 
}
