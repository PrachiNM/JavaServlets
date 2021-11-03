package com.prachi.random;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String output = "<html>"
				+ "<body>"
				+ "<h1>From Welcome.java</h1>"
				+ "</body>"
				+ "</html>";
		out.write(output);
	}

}
