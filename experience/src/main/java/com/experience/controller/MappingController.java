package com.experience.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MappingController {
	
	@Autowired 
	private HttpServletRequest request;
	
	@RequestMapping(value = "/role/permission", method = RequestMethod.GET) 
	public String userUser(Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		return "rolepermission/role_permission_add";    
	}
	
	private boolean isValidUser() {
		Object username = request.getSession().getAttribute("loggedInUser");
		if(username ==  null){
			return false;
		}
		return true;
	}
	
	

}
