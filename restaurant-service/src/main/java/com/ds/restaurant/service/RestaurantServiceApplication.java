package com.ds.restaurant.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }

    // @Bean
    public AnonymousAuthenticationFilter filter() {
        return new AnonymousAuthenticationFilter("bootAdminClient", "bootAdminClientUser", AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
    }

    // @Bean
    public AnonymousAuthenticationProvider provider() {
        return new AnonymousAuthenticationProvider("bootAdminClient");
    }

}
