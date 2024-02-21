package com.springboot.blog.config;

import com.springboot.blog.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Autowired
    private CustomUserDetailsService userDetailsService;



//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager() {
//        UserDetails mohamed = User.builder()
//                .username("user")
//                .password(passwordEncoder().encode("user"))
//                .roles("USER")
//                .build();
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(mohamed,admin);
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer->
                configurer
                        .requestMatchers(HttpMethod.GET,"/api/posts/**").hasRole("USER")
                        .requestMatchers(HttpMethod.POST,"/api/posts/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT,"/api/posts/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/api/posts/**").hasRole("ADMIN")

        );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf->csrf.disable());

        return http.build();
    }



    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }




}
