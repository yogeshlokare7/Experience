package com.experience.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.dto.UserDto;
import com.experience.entity.User;
import com.experience.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired 
	private HttpServletRequest request;
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET) 
	public String userUser(Model model) {
		if(!isValidUser()){
			return "redirect:/login";
		}
		model.addAttribute("userDto",new UserDto());
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/view", method = RequestMethod.GET) 
	public String viewUser(Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		List<User> list = userService.getUsers();
		model.addAttribute("users",list);
		return "user/view_user";    
	}
	
	@RequestMapping(value = "/user/profile", method = RequestMethod.GET) 
	public String viewProfile(Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		return "user/profile_user";    
	}

	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET) 
	public String editUser(@PathVariable("id") Integer id, Model model, HttpServletResponse response) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		User user = userService.getUser(id);
		model.addAttribute("user",user);
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET) 
	public String deleteUser(@PathVariable("id") Integer id) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		User user = userService.getUser(id);
		if(user!=null) {
			userService.deleteUser(user);
		}
		return "redirect:/user/view";   
	}
	
	//POST
	@RequestMapping(value="/user/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		if(user.getId()!=null && user.getId()>0) {
			userService.updateUser(user);
		}else {
			userService.saveUser(user);
		}
		return "redirect:/user/view";
	}
	
	private boolean isValidUser() {
		Object username = request.getSession().getAttribute("loggedInUser");
		if(username ==  null){
			return false;
		}
		return true;
	}
	
	/*MultipartFile multipartFile = user.getImage();
	if (null != multipartFile)
	{
		try {
			byte [] byteArr=multipartFile.getBytes();
			String imageStr = Base64.encodeBase64String(byteArr);
			user.setPicture(imageStr);
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/
	
}
	