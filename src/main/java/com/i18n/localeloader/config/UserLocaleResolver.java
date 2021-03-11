package com.i18n.localeloader.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.i18n.CookieLocaleResolver;

public class UserLocaleResolver extends CookieLocaleResolver{
	
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String locale = "en";
		if (request.getSession() != null) {
			if (request.getSession().getAttribute("userLocale") != null) {
				locale = (String) request.getSession().getAttribute("userLocale");		
			}
		}
		
		return Locale.forLanguageTag(locale);
	}
	
}
