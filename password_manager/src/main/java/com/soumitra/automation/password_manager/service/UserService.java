package com.soumitra.automation.password_manager.service;

import com.soumitra.automation.password_manager.dto.UserResponseDTO;
import com.soumitra.automation.password_manager.exception.UsersException;

public interface UserService {

    public UserResponseDTO getUser(Long userId) throws UsersException;

}
