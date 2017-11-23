package com.aouth.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by muhamd gomaa on 11/19/2017.
 */
@Configuration
public class securityconfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .antMatchers("/login", "/oauth/authorize")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().defaultSuccessUrl("/halo").permitAll();
    }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.parentAuthenticationManager(authenticationManager)
                    .inMemoryAuthentication()
                    .withUser("mohamed").password("123").roles("USER");
// database
            //        auth
//                .jdbcAuthentication()
//                .dataSource(dataSource)
//                .passwordEncoder(passwordEncoder())
//                .usersByUsernameQuery("select username, password, enabled from s_user where username = ?")
//                .authoritiesByUsernameQuery("select s_user.username, s_permission.nama as authority\n"
//                        + "from s_user inner join s_user_group on s_user.id = s_user_group.id_user\n"
//                        + "inner join s_group on s_user_group.id_group = s_group.id\n"
//                        + "inner join s_group_permission on s_group.id = s_group_permission.id_group\n"
//                        + "inner join s_permission on s_permission.id = s_group_permission.id_permission\n"
//                        + "where s_user.username = ?");
        }
}