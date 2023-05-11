//package com.portfolio_gs.backend;
//
//import com.portfolio_gs.backend.repository.UserRepository;
//import com.portfolio_gs.backend.security.jwt.JwtTokenFilter;
//import javax.servlet.Filter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class AplicationSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserRepository userRepo;
//    @Autowired
//    private JwtTokenFilter jwtTokenFilter;
//    
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(username -> userRepo.findByEmail(username)
//                .orElseThrow(() -> new UsernameNotFoundException("No se encontró el usuario"))
//        );
//    }
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        
//        http.cors().and();
//        http.csrf().disable()
//                .authorizeRequests().antMatchers("/api/**").permitAll()
//                .antMatchers("/**/todos").permitAll()
//                .antMatchers("/**/todas").permitAll()
//                .antMatchers("/usuario/id/**").permitAll()
//                .antMatchers("/Mail/enviar").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//        http.addFilterBefore(jwtTokenFilter, Filter.class);
//    }
//
//}
