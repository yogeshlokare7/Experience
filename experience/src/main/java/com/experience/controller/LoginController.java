package com.experience.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.experience.entity.User;
import com.experience.service.EmailService;
import com.experience.service.UserService;


@Controller   
public class LoginController {

	
	@Autowired
	private UserService userService;
	
	@Autowired 
	private HttpServletRequest request;
	
	@Autowired
	private EmailService emailService;


	@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/forgot", method = RequestMethod.GET) 
	public String resetPage() {
		return "forgot";    
	}
	
	@RequestMapping(value = "/forgot/reset", method = RequestMethod.GET)
	public String displayResetPasswordPage(@RequestParam("token") String token, Model model) throws Exception {
		User user = userService.findUserByResetToken(token);
		if (user!=null) { 
			System.out.println("Hello--------->\n"+user.toString());
			model.addAttribute("id", user.getId());
			return "reset";
		}
		return "alert_out";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET) 
	public String updatePassword(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("id", id);
		return "update_password";    
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		if(!isValidUser()){
			return "redirect:/login";
		}
		return "helloworld";
	}

	//****************************************POST***********************************

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) throws Exception {
		System.out.println("==============="+username+"=============="+password);
		if(username.equals("admin@mjbtech.com") && password.equals("admin")) {
			User user = new User();
			user.setUseremail("admin@mjbtech.com");
			user.setFirstname("Admin");
			session.setAttribute("loggedInUser", user);
			return "redirect:/dashboard";
		}else {
			try {
			User user = userService.loginUser(username, password);
				if(user == null) {
					model.addAttribute("loginError", "Error logging in. Please try again");
					return "login";
				}
				session.setAttribute("loggedInUser", user);
				return "redirect:/dashboard";
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		model.addAttribute("loginError", "Something is wrong. Please try again");
		return "alert_out";
	}
	
	@RequestMapping(value="/reset/{id}",method=RequestMethod.POST)
	public String setNewPassword(@PathVariable("id") Integer id, @RequestParam String password, Model model) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n\n\n\n"+id);
		User user = userService.getUser(id);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n\n\n\n"+user.toString());
		user.setUserpwd(password);
		user.setResettoken(null);
		userService.updateUser(user);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
	public String updatePassword(@PathVariable("id") Integer id, @RequestParam String password, Model model) throws Exception {
		User user = userService.getUser(id);
		user.setUserpwd(password);
		userService.updateUser(user);
		model.addAttribute("user",user);
		model.addAttribute("found","Successfully updated!!!");
		return "alert_in";
	}

	
	@RequestMapping(value = "/forgot", method = RequestMethod.POST)
	public String processForgotPasswordForm(@RequestParam("userEmail") String userEmail, Model model, HttpServletRequest request) throws Exception {
		System.out.println("user email\nnnn\n"+userEmail);
		try {
			User user = userService.findUserByUseremail(userEmail);
			if (user!=null) {
				user.setResettoken(UUID.randomUUID().toString());
				userService.updateUser(user);
				String appUrl = request.getScheme() + "://" + request.getServerName()+":"+request.getServerPort()+request.getRequestURI();
				SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
				passwordResetEmail.setFrom("noreply@mjbtech.com");
				passwordResetEmail.setTo(user.getUseremail());
				passwordResetEmail.setSubject("Password Reset Request");
				passwordResetEmail.setText("Hello "+user.getFirstname()+",\n\n\nTo reset your password, click the link below:\n\n\n URL: " + appUrl
						+ "/reset?token=" + user.getResettoken()+"\n\n\n\nSincerely,\nThe Experience Team");
				try {
					emailService.sendEmail(passwordResetEmail);
				}catch(Exception e) {
					e.printStackTrace();
				}
				model.addAttribute("user",user);
				model.addAttribute("found","We've sent an email to <b>"+user.getUseremail()+"</b>. Click the link in the email to reset your password.");
				return "forgot";	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("notFound","Couldn't find your Experience Account.");
		return "forgot";
	}

	private boolean isValidUser() {
		Object username = request.getSession().getAttribute("loggedInUser");
		if(username ==  null){
			return false;
		}
		return true;
	}
}
