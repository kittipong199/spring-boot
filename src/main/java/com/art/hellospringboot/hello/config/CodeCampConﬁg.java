package com.art.hellospringboot.hello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;


import org.springframework.context.annotation.Configuration;
@ConfigurationProperties(prefix = "codecamp") 
public class CodeCampConﬁg {
	
	private String language; 
	private String student; 
public String getLanguage() { return this.language; } 
public String getStudent() { return this.student; } 
public void setLanguage(String language) { this.language = language; } 
public void setStudent(String student) { this.student = student; } }




	
	