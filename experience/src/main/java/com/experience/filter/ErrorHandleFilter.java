package com.experience.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandleFilter implements Filter {


	public void destroy() {
	}


	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		RequestDispatcher requestDispatcher = null;
		try {
			Object attribute = request.getSession().getAttribute("userdto");
			if(attribute == null) {
				requestDispatcher = request.getRequestDispatcher("/login");
			}else {
				requestDispatcher =  request.getRequestDispatcher("/dashboard");
			}
		}
		catch (Exception e) {
			requestDispatcher =   servletRequest.getRequestDispatcher("/login");
		}
		requestDispatcher.forward(request, response);
		request.getSession().setAttribute("isFilter", "isFilter");
		Object object = request.getSession().getAttribute("isFilter");
		if(object==null) {
			filterChain.doFilter(servletRequest, servletResponse);
		}
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
