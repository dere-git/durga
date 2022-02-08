package com.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.main.dto.EmployeeDTO;
import com.main.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	//EmpoloyeeDaoImpl empoloyeeDaoImpl ;
	EmployeeService  employeeService;
	
	
@GetMapping("showEmployees")
	String showAll(Model model){	
		
	   List<EmployeeDTO>   employeeDTOlist=employeeService.FetchAllEmployees();	   
	  
	   model.addAttribute( "employeeDTOlist"  ,employeeDTOlist);
		
		return "showAllEmp";//showAllEmp.jsp
	}
	

	@GetMapping ("register")
	String getRegistrationPage() {
		return "registration";
	}
	
	@PostMapping("register")
	String registerEmployee(@ModelAttribute EmployeeDTO employeeDTO,Model model) {	
		System.out.println(employeeDTO);
		employeeService.saveEmployee(employeeDTO);

		List<EmployeeDTO>   employeeDTOlist=employeeService.FetchAllEmployees();	   
		model.addAttribute( "employeeDTOlist"  ,employeeDTOlist);
		return "showAllEmp";//showAllEmp.jsp
	}
}

		
	
	
	

	


