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
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class ApiServlet extends HttpServlet {

  

private String message;

public void init() throws ServletException {
   message = "TODO";
}

public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
   
   // Set response content type
   response.setContentType("text/html");

   // Actual logic goes here.
   PrintWriter out = response.getWriter();
   out.println("<h1>" + message + "</h1>");
}

protected void doDelete(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException
{
  //TODO
}

protected void doPost(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException
{
  //TODO
}

protected void doPut(HttpServletRequest pReq, HttpServletResponse pResp) throws ServletException, IOException
{
  //TODO
}

public void destroy() {
   // do nothing.
}
}
