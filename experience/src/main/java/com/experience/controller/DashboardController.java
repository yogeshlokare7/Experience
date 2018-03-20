/**
 * 
 */
package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.dto.UserDto;

/**
 * @author Pravin Tumasre
 *
 */

@Controller   
public class DashboardController {

	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET) 
	public String viewDashboard() {
		return "dashboard/view_dashboard";    
	}
	
	@RequestMapping(value = "/dashboard/viewreport1", method = RequestMethod.GET) 
	public String viewReport1() {
		return "dashboard/view_report_1";    
	}
	
	@RequestMapping(value = "/dashboard/viewreport2", method = RequestMethod.GET) 
	public String viewReport2() {
		return "dashboard/view_report_1";    
	}
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET) 
	public String viewDemoPage() {
		return "dashboard/demo";    
	}
	
	@RequestMapping(value = "/demo", method = RequestMethod.POST) 
	public String demoDemoPage(@ModelAttribute UserDto dto, Model model) {
		System.out.println("dto--------------\n"+dto.toString());
		return "redirect:/dashboard";    
	}
}
