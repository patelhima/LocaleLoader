package com.i18n.localeloader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value = { "/","/introduction" })
	public ModelAndView gotoDefaultPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("introduction");
		return model;
	}
	
	@GetMapping(value = { "/localeSelection" })
	public ModelAndView goToNextPage(ModelAndView model) {
		model.setViewName("localeSelection");
		return model;
	}
	
	@PostMapping(value = { "/saveLocale" })
	public ModelAndView myLocale(ModelAndView model,
			HttpServletRequest request, @RequestParam String selectedLocale) {
		request.getSession().setAttribute("userLocale", selectedLocale);
		model.setViewName("mainPage");
		return model;
	}
	
}
