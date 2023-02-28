package com.exterro.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails admin =
				User.withDefaultPasswordEncoder()
				.username("admin")
				.password("welcome123")
				.roles("ADMIN")
				.build();
		
		UserDetails user =
				User.withDefaultPasswordEncoder()
					.username("user")
					.password("welcome")
					.roles("USER")
					.build();

		return new InMemoryUserDetailsManager(admin, user);
	}
	
	

}
