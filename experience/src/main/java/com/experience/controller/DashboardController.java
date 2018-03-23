/**
 * 
 */
package com.experience.controller;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.experience.dto.UserDto;
import com.experience.entity.User;

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
	
}
