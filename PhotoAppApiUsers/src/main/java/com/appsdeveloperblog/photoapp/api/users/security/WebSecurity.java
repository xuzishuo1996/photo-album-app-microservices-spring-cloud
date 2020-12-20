package com.appsdeveloperblog.photoapp.api.users.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();  // CSRF: Cross Site Request Forgery
        http.authorizeRequests().antMatchers("/users/**").permitAll();
        http.headers().frameOptions().disable();    // to connect to h2-console
    }
}
