package com.experience.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.UserPermission;
import com.experience.service.PermissionService;

@Controller
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService;
	
	@Autowired 
	private HttpServletRequest request;

	@RequestMapping(value = "/permission/add", method = RequestMethod.GET) 
	public String addpermission() {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/view", method = RequestMethod.GET) 
	public String viewpermission(Model model) throws Exception {
		if(!isValidUser()) {
			return "redirect:/login";
		}
		List<UserPermission> list = permissionService.getPermissionList();
		model.addAttribute("permissions",list);
		return "permission/view_permission";    
	}

	@RequestMapping(value = "/permission/edit/{id}", method = RequestMethod.GET) 
	public String editpermission(@PathVariable("id") Integer id, Model model) throws Exception {
		if(!isValidUser()) {
			return "redirect:/login";
		}
		UserPermission permission =permissionService.getPermission(id);
		model.addAttribute("permission",permission);
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/delete/{id}", method = RequestMethod.GET) 
	public String deletepermission(@PathVariable("id") Integer id) throws Exception {
		if(!isValidUser()) {
			return "redirect:/login";
		}
		permissionService.deletePermission(id);
		return "redirect:/permission/view";     
	}
	
	@RequestMapping(value="/permission/save", method=RequestMethod.POST)
	public String savePermissionDetail(@ModelAttribute("permission") UserPermission permission, BindingResult result) throws Exception {
		if(result.hasErrors()) {
			return "permission/add_permission";   
		}
		if(permission.getId()!=null && permission.getId()>0) {
			permissionService.updatePermission(permission);
		}else {
			permissionService.savePermission(permission);
		}
		return "redirect:/permission/view";
	}
	
	private boolean isValidUser() {
		Object username = request.getSession().getAttribute("loggedInUser");
		if(username ==  null){
			return false;
		}
		return true;
	}
	
}
