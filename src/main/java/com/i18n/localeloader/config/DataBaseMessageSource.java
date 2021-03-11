package com.i18n.localeloader.config;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import com.i18n.localeloader.entity.LanguageMessageEntity;
import com.i18n.localeloader.repository.LanguageMessageRepository;

public class DataBaseMessageSource extends AbstractMessageSource {


	@Autowired
	private LanguageMessageRepository languageMessageRepository;
	
	private static final String DEFAULT_LOCALE_CODE = "en";

	@Override
	protected MessageFormat resolveCode(String key, Locale locale) {
		LanguageMessageEntity languageMessage = languageMessageRepository.findByKeyAndLocale(key,locale.getLanguage());
		String content = key;
		if (languageMessage == null) {
			languageMessage = languageMessageRepository.findByKeyAndLocale(key,DEFAULT_LOCALE_CODE);
		}
		if(languageMessage!=null) {
			content = languageMessage.getContent();
		}
		return new MessageFormat(content, locale);
	}

}
