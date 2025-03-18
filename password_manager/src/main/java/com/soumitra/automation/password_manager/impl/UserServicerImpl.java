package com.soumitra.automation.password_manager.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumitra.automation.password_manager.dto.UserResponseDTO;
import com.soumitra.automation.password_manager.entity.Users;
import com.soumitra.automation.password_manager.exception.UsersException;
import com.soumitra.automation.password_manager.repo.UserRepository;
import com.soumitra.automation.password_manager.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServicerImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDTO getUser(Long userId) throws UsersException {

        Optional<Users> optional = userRepository.findById(userId);

        Users user = optional.orElseThrow(() -> new UsersException("User not found"));
        
        UserResponseDTO userResponseDTO = new UserResponseDTO(user.getUsername(), user.getPassword(),
            user.getDeletedRow(), user.getCreatedDt(), user.getUpdatedDt());

       return userResponseDTO;
    }

}
