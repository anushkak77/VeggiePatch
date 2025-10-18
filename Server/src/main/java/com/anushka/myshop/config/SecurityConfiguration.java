package com.anushka.myshop.config;

<<<<<<< HEAD
import com.anushka.myshop.config.JwtAuthenticationFilter;
=======

>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private JwtAuthenticationFilter jwtAuthFilter;
<<<<<<< HEAD

=======
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
    @Autowired
    private AuthenticationProvider authenticationProvider;

    @Bean
<<<<<<< HEAD
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                                .requestMatchers(
                                        "/auth/**",       // login, register, etc.
                                        "/product/all",   // open product list
                                        "/error",         // default error page
                                        "/", "/index.html" // home page if using html
                                ).permitAll().requestMatchers("/admin/**").hasRole("ADMIN")   // needs ADMIN role
                                .requestMatchers("/cart/**", "/order/**", "/payment/**").authenticated() // needs JWT
                                .anyRequest().authenticated()

                )
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
=======
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
         http.csrf().disable()
                 .authorizeHttpRequests()

                 .requestMatchers("/**")
                 .permitAll()
//                .requestMatchers("/product/**").hasRole(ADMIN.name())
//                 .requestMatchers("/cart/**").hasRole(ADMIN.name())
                .anyRequest()
                .authenticated()
                 .and()
                 .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                 .and()
                 .authenticationProvider(authenticationProvider)
                 .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }




>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
}
