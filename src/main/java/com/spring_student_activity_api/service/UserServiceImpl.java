package com.spring_student_activity_api.service;

import java.util.Optional;
import com.spring_student_activity_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import com.spring_student_activity_api.exception.ResourceNotFoundException;
import com.spring_student_activity_api.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findByUserUsername(String username) {
        return Optional.ofNullable(userRepository.findByUserUsername(username).orElseThrow(() -> new ResourceNotFoundException("ไม่พบข้อมูล : " + username)));
    }
    
}
