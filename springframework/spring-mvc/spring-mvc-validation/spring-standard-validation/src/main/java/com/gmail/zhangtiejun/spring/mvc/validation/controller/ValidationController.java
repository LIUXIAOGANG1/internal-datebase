package com.gmail.zhangtiejun.spring.mvc.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gmail.zhangtiejun.spring.mvc.validation.domain.User;

@Controller
public class ValidationController {
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index(Model model) {
		return defaultView(model);
    }
	
	@RequestMapping(value = "/register.html", method = RequestMethod.GET)
    public String viewRegister(Model model) {
		return defaultView(model);
    }
 
    @RequestMapping(value = "/register.html", method = RequestMethod.POST)
    public String doRegister(
    		@Valid @ModelAttribute("user") User userForm, 
    		BindingResult result, 
    		RedirectAttributes redirectAttributes) {
 
        if (result.hasErrors()) {
            return "register";
        }
        redirectAttributes.addFlashAttribute("successMsg", "提交成功");
        return "redirect:/register.html";
    }
    
    private String defaultView(Model model) {
		User user = new User();
		model.addAttribute("user", user);
        return "register";
	}
}
