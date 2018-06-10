/**
 * 
 */
package com.ds.user.management.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.user.management.service.model.User;

/**
 * @author Sarvesh
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/random")
    public User getRandomUser() {
        return User.random();
    }

    @GetMapping("/random/{count}")
    public List<User> getRandomUsers(@PathVariable int count) {
        return Stream.generate(() -> getRandomUser())
                     .limit(count)
                     .collect(Collectors.toList());
    }

}
