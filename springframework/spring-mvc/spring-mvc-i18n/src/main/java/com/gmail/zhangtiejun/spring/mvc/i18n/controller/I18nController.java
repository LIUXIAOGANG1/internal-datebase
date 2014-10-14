package com.gmail.zhangtiejun.spring.mvc.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18nController {
	
	@RequestMapping(value="/index.html")
	public String sayHello(){
		return "index";
	}
}
