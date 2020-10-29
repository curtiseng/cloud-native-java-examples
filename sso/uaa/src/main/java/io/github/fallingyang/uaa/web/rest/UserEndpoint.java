package io.github.fallingyang.uaa.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/**
 * @author yangzifeng
 */
@RestController
public class UserEndpoint {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
