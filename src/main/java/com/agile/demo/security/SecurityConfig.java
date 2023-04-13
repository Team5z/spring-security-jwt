package com.agile.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService UserEntity() {
        final PasswordEncoder pw = passwordEncoder();
        UserDetails user1 = User.builder()
                .username("user1")
                .password(pw.encode("7777"))
                .roles("User").build();
        UserDetails admin = User.builder()
                .username("admin")
                .password(pw.encode("0000"))
                .roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user1, admin);
    }

    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

    }

    @Override
    //   .formLogin()
    //   .and()
    //   .authorizeRequests(auth->{
    //       auth.anyRequest().permitAll()

    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .and()
                .authorizeRequests(auth->{
                    auth.anyRequest().permitAll()
                    ;
                })
        ;
    }

}