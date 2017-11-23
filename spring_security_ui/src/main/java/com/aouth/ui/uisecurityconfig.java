package com.aouth.ui;

/**
 * Created by muhamd gomaa on 11/19/2017.
 */


import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

    @EnableOAuth2Sso
    @Configuration
    public class uisecurityconfig extends WebSecurityConfigurerAdapter {

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/**")
                    .authorizeRequests()
                    .antMatchers("/", "/login**")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        }

    }
