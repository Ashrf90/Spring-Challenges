package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
          return http
                  .authorizeHttpRequests(auth -> auth
                          .mvcMatchers(...patterns: "/api/v1/welcome").permitAll()
                          .anyRequest().authenticated())
                  .build();
    }

}


