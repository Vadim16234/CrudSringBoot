package com.example.crudsringboot.service;

import com.example.crudsringboot.model.User;
import com.example.crudsringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getOne(id);
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @GetMapping("/user-create")
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @PostMapping("/user-create")
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
