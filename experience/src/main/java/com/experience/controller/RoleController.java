package com.experience.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.Role;
import com.experience.service.RoleService;
import com.experience.serviceImpl.RoleServiceImpl;

@Controller
public class RoleController {

	@Autowired 
	private HttpServletRequest request;
	
	@Autowired
	RoleService  roleService;
	
	/// THIS IS GET MTHODS 
	@RequestMapping(value = "/role/add", method = RequestMethod.GET) 
	public String addRole() {
		return "role/add_role";    
	}

	@RequestMapping(value = "/role/view", method = RequestMethod.GET) 
	public String viewRole(Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		model.addAttribute("roles", roleService.getRoleList());
		return "role/view_role";    
	}

	@RequestMapping(value = "/role/edit/{id}", method = RequestMethod.GET) 
	public String editRole(@PathVariable("id") Integer id, Model model) throws Exception {
		Role role = roleService.getRole(id);
		model.addAttribute("role",role);
		return "role/view_role";    
	}

	@RequestMapping(value = "/role/delete/{id}", method = RequestMethod.GET) 
	public String deleteRole(@PathVariable("id") Integer id) throws Exception {
		roleService.deleteRole(id);
		return "redirect:/role/view";      
	}
	
	
	/// THIS IS POST MTHODS 
	
	@RequestMapping(value="/role/save",method=RequestMethod.POST)
	public String saveRole(@ModelAttribute("Role") Role role) throws Exception {
		System.out.println("==============="+role.toString());
		if(!isValidUser()){
			return "redirect:/login";
		}
		roleService.saveRole(role);
		return "redirect:/role/view";
	}
	
	private boolean isValidUser() {
		Object username = request.getSession().getAttribute("loggedInUser");
		if(username ==  null){
			return false;
		}
		return true;
	}
}
