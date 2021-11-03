package com.prachi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long num1 = Integer.parseInt(request.getParameter("number1"));
		long num2 = Integer.parseInt(request.getParameter("number2"));
		PrintWriter out = response.getWriter();
		String output = "<html>"
				+ "<body>"
				+ "Sum is: "+Long.toString(num1+num2)
				+ "</body>"
				+ "</html>";
		out.write(output);
	}

}
