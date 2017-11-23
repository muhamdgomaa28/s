package com.aouth.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by muhamd gomaa on 11/19/2017.
 */
    @RestController
    public class usercontroller {
        @GetMapping("/user/me")
        public Principal user(Principal principal) {
            return principal;

    }

    @GetMapping("/hello")
    public String user() {
        return "hello";

    }
}
