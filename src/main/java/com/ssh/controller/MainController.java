package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssh.service.TestService;

@Controller

public class MainController {
	@Autowired 
	private TestService te;
	
	@RequestMapping(value = "savePlayer", method = RequestMethod.GET)
	@ResponseBody
	
	public String savePlayer(){
		
		te.save();
		return "success!";
	}
	
	
}
