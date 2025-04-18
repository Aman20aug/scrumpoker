package com.scrum.Scrumboard.service;

import com.scrum.Scrumboard.DTO.UserDTO;

public interface IUserService {
    boolean createUser(UserDTO user);

    UserDTO getUser(String userId);
}
