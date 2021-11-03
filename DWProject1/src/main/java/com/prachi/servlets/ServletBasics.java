package com.prachi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletBasics extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String resp = "<html>"
				+ "<body>"
				+ "<h1>Hello World!!</h1>"
				+ "</body>"
				+ "</html>";
		out.write(resp);
		
	}

}
