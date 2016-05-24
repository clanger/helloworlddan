package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class HelloWorldServlet extends HttpServlet {
	

	private static final long serialVersionUID = -5520465417783269710L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletInputStream inputStream = req.getInputStream();
        String strRequest = IOUtils.toString( inputStream );
        resp.getOutputStream().write(strRequest.getBytes());
        resp.getOutputStream().write(strRequest.toUpperCase().getBytes());
	}

}
