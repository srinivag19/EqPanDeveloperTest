/**
 * 
 */
package com.pancredit.dao;

import com.pancredit.model.Payment;

import java.util.List;

/**
 * 
 */
public interface PaymentDAO {
	
	List<Payment> getAllPayments();

	void createPayment(Payment payment);

	boolean deletePayment(String paymentId);

	boolean updatePayment(String paymentId, Payment updatedPayment);

}
