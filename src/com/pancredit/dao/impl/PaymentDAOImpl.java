/**
 * 
 */
package com.pancredit.dao.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pancredit.dao.PaymentDAO;
import com.pancredit.model.Payment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class PaymentDAOImpl implements PaymentDAO {

	private List<Payment> payments;
	private ObjectMapper objectMapper;

	public PaymentDAOImpl() {
		payments = readDataFromJson();
		objectMapper = new ObjectMapper();
	}

	public List<Payment> getAllPayments() {
		return new ArrayList<>(payments);
	}

	public void createPayment(Payment payment) {
		payments.add(payment);
		saveDataToJson();
	}

	public boolean deletePayment(String paymentId) {
		return payments.removeIf(payment -> payment.getId().equals(paymentId));
	}

	public boolean updatePayment(String paymentId, Payment updatedPayment) {
		for (int i = 0; i < payments.size(); i++) {
			if (payments.get(i).getId().equals(paymentId)) {
				payments.set(i, updatedPayment);
				saveDataToJson();
				return true;
			}
		}
		return false;
	}

	private List<Payment> readDataFromJson() {
		List<Payment> result = new ArrayList<>();

		// Get the input stream of the JSON file
		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data.json")) {
			System.out.println("path is" + getClass().getClassLoader().getResource("../../resources/data.json"));
			System.out.println("path 2 is" + getClass().getClassLoader().getResource("data.json"));
			System.out.println("path 3 is" + getClass().getClassLoader().getResource("WEB-INF/data.json"));
			System.out.println("path 4 is" + getClass().getClassLoader().getResource("resources"));
			System.out.println("path 4 is" + getClass().getClassLoader().getResource("WEB-INF"));

			if (inputStream != null) {
				// Use Jackson's ObjectMapper to parse JSON array
				ObjectMapper objectMapper = new ObjectMapper();
				result = objectMapper.readValue(inputStream, new TypeReference<List<Payment>>() {
				});

			}

		} catch (IOException e) {
			// Handle IOException
			e.printStackTrace();

		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();

		}
		return result;
	}

	private void saveDataToJson() {
		try (Writer writer = new FileWriter(getClass().getClassLoader().getResource("data.json").getFile())) {
			objectMapper.writeValue(writer, payments);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
