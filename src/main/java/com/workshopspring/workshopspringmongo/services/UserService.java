package com.workshopspring.workshopspringmongo.services;

import java.util.List;

import com.workshopspring.workshopspringmongo.domain.User;
import com.workshopspring.workshopspringmongo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;

    public List<User> findAll() { 
        return repo.findAll();
    }
    

}
