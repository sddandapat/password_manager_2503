package com.soumitra.automation.password_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumitra.automation.password_manager.dto.UserResponseDTO;
import com.soumitra.automation.password_manager.exception.UsersException;
import com.soumitra.automation.password_manager.impl.UserServicerImpl;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserServicerImpl userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long userId) throws UsersException {
        
        UserResponseDTO userResponseDTO = userService.getUser(userId);

        return ResponseEntity.ok(userResponseDTO);

        
    }

}
