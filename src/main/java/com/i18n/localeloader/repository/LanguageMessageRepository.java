package com.i18n.localeloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.i18n.localeloader.entity.LanguageMessageEntity;

@Repository
public interface LanguageMessageRepository extends JpaRepository<LanguageMessageEntity, Integer> {
	
	LanguageMessageEntity findByKeyAndLocale(String key, String locale);

}
