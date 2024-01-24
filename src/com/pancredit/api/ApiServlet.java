/*
 *  PANCREDIT SYSTEMS LTD
 *  (C) Copyright PanCredit Systems Ltd 2021
 *
 *  COPYRIGHT NOTICE
 *  ---------------------------------
 *  The contents of this file are protected by copyright. Any unauthorised
 *  copying, duplication of its contents are in breach of the copyright.
 *
 *  Last Checked In By: $Author$
 *  Date Checked In:    $Date$
 *  Name and Version:   $Id$
 *
 *  Log messages:       $Log$
 * 
 */
package com.pancredit.api;

//Import required java libraries
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pancredit.dao.impl.PaymentDAOImpl;
import com.pancredit.model.Payment;
import com.pancredit.service.PaymentService;

//Extend HttpServlet class
public class ApiServlet extends HttpServlet {

	/**
		 * 
		 */
	private static final long serialVersionUID = 9111894038723756575L;
	private PaymentService paymentService;
    private ObjectMapper objectMapper;

	public void init() throws ServletException {
		paymentService = new PaymentService(new PaymentDAOImpl());
        objectMapper = new ObjectMapper();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        List<Payment> payments = paymentService.getAllPayments();
        response.getWriter().write(objectMapper.writeValueAsString(payments));
	}

	protected void doDelete(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException {
		// TODO
	}

	protected void doPost(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException {
		// TODO
	}

	protected void doPut(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException {
		// TODO
	}

	public void destroy() {
		// do nothing.
	}
}
