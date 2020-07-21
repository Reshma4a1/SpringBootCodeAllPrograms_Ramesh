package com.rameshit.mvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginValidator loginValidator;
	
	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView weclome() {
		System.out.println("weclome called");
		ModelAndView model = new ModelAndView("login");
		model.getModelMap().put("loginModel", new LoginModel());
		return model;
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	protected ModelAndView processForm(
			@ModelAttribute LoginModel loginModel,
			BindingResult bindingResult) {
		System.out.println("processForm called");
	
		String viewName = null;
		ModelAndView modelAndView = new ModelAndView();

		loginValidator.validate(loginModel, bindingResult);
		
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("login");
			return modelAndView;
		}
		//business logic
		String username = loginModel.getUsername();
		String password = loginModel.getPassword();

		System.out.println("username:" + username);
		System.out.println("password: " + password);

		if ("ramesh".equals(username) && "spring".equals(password)) {
			viewName = "success";
		} else {
			viewName = "fail";
		}

		modelAndView.getModel().put("loginModel1", loginModel);
		modelAndView.setViewName(viewName);
		return modelAndView;
	}
}
