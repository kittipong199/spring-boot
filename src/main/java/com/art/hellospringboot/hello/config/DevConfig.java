package com.art.hellospringboot.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.art.hellospringboot.hello.modelled.BankAccount;

@Configuration
@Profile("development") 
public class DevConfig {
	 @Bean   
	 public BankAccount bankAccount() {       
		 return new BankAccount(); 
	 }

}
