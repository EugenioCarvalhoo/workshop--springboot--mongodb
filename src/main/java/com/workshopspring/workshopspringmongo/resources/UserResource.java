package com.workshopspring.workshopspringmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.workshopspring.workshopspringmongo.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria da silva ", "maria@gmail.com");
        User alex = new User("2", "Alex da silva ", "alex@gmail.com");
        List<User> list = new ArrayList<User>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }

}