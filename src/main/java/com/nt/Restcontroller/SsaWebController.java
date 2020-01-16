package com.nt.Restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.entity.SsaWebEntity;
import com.nt.service.SsaWebMgmtService;

@Controller
public class SsaWebController {
	@Autowired
	private SsaWebMgmtService service;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String viewssaweb(Model  model) {
		SsaWebEntity entity= new SsaWebEntity();
			model.addAttribute("ssweb",entity );
		return "Ssa_Web";
	}
	@RequestMapping(value = "/ssaweb")
	public String submitbtn(@ModelAttribute("ssweb")Model model) {
		
		
		return null;
		
		
	}

}
