/**
 * 
 */
package com.pancredit.service;

import com.pancredit.model.Payment;
import com.pancredit.dao.PaymentDAO;

import java.util.List;
import java.util.UUID;

/**
 * 
 */
public class PaymentService {

	private final PaymentDAO paymentDAO;

	public PaymentService(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}

	public List<Payment> getAllPayments() {
		return paymentDAO.getAllPayments();
	}

	public void createPayment(Payment payment) {
		payment.setId(UUID.randomUUID().toString());
		paymentDAO.createPayment(payment);
	}

	public boolean deletePayment(String paymentId) {
		return paymentDAO.deletePayment(paymentId);
	}

	public boolean updatePayment(String paymentId, Payment updatedPayment) {
		return paymentDAO.updatePayment(paymentId, updatedPayment);
	}

}
