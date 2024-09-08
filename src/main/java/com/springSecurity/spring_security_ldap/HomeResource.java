package com.springSecurity.spring_security_ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@GetMapping("/")
	public String index() {
		return "Home Page";
	}
}
