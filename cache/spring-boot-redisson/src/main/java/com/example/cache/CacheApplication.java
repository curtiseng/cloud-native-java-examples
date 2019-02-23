package com.example.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangzifeng
 */
@SpringBootApplication
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }

    @RestController
    class UserController {
        private CacheUser cacheUser;

        public UserController(CacheUser cacheUser) {
            this.cacheUser = cacheUser;
        }

        @GetMapping("/users")
        public ResponseEntity<List<User>> getUsers() {
            return ResponseEntity.ok(cacheUser.findUsers());
        }

    }

    @Service
    class CacheUser {

        @Cacheable(cacheNames = "users")
        public List<User> findUsers() {
            List<User> users = new ArrayList<>();
            users.add(new User("1", "user1", 1));
            users.add(new User("2", "user2", 0));
            users.add(new User("3", "user3", 1));
            return users;
        }
    }



}
