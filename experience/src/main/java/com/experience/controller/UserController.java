package com.experience.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.experience.dto.UserDto;
import com.experience.entity.Role;
import com.experience.entity.User;
import com.experience.service.EmailService;
import com.experience.service.RoleService;
import com.experience.service.UserService;
import com.experience.util.StringUtils;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired 
	private HttpServletRequest request;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET) 
	public String userUser(Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		model.addAttribute("roles",roleService.getRoleList());
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
		model.addAttribute("roles",roleService.getRoleList());
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
	
	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET) 
	public String viewDemoPage(@PathVariable("id") Integer id, Model model) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		User user = userService.getUser(id);
		model.addAttribute("user",user);
		return "dashboard/demo";    
	}
	
	//POST
	@RequestMapping(value="/user/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute UserDto userDto) throws Exception {
		if(!isValidUser()){
			return "redirect:/login";
		}
		setProfileImage(userDto);
		Role role = roleService.getRole(userDto.getUserrole());
		if(userDto.getId()!=null && userDto.getId()>0) {
			User user = userService.getUser(userDto.getId());
			userDto.getEntityFromDTO(user); 
			user.setUserrole(role);
			userService.updateUser(user);
		}else {
			User user = new User();
			userDto.getEntityFromDTO(user); 
			user.setUserrole(role);
			@SuppressWarnings("static-access")
			String password = new StringUtils().generateRandomPassword();
			user.setUserpwd(password);
			userService.saveUser(user);
			String appUrl = request.getScheme() + "://" + request.getServerName()+":"+request.getServerPort();

			SimpleMailMessage registrationEmail = new SimpleMailMessage();
			registrationEmail.setTo(user.getUseremail());
			registrationEmail.setSubject("Experience Online Service Team");
			registrationEmail.setText("Hello "+user.getFirstname()+"\n\n\nUser account created with below details:\n\nUsername: "+user.getUseremail()+"\nPassword:"+user.getUserpwd()
					+ "\n\n\nPlease login here:" +appUrl +"\n\n\nSincerely,\nThe Experience Team");
			registrationEmail.setFrom("noreply@domain.com");
			emailService.sendEmail(registrationEmail);
		}
		return "redirect:/user/view";
	}
	
	private void setProfileImage(UserDto dto) {
		MultipartFile file = dto.getImages();
		if (!file.isEmpty() && file!=null) {
			try {
				byte[] bytes = file.getBytes();
				String imageStr = Base64.encodeBase64String(bytes);
				dto.setPicture(imageStr);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
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
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST) 
	public String demoDemoPage(@ModelAttribute UserDto dto, Model model) throws Exception {
		System.out.println("dto--------------\n"+dto.toString());
		setProfileImage(dto);
		User user = userService.getUser(dto.getId());
		dto.getEntityFromDTO(user);
		userService.updateUser(user);
		return "redirect:/dashboard";    
	}
	
}
	