package com.scrum.Scrumboard.service;


import com.scrum.Scrumboard.DTO.UserDTO;
import com.scrum.Scrumboard.entity.UserEntity;
import com.scrum.Scrumboard.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;


    @Override
    public boolean createUser(UserDTO user) {
        UserEntity userEntity=new UserEntity();
        userEntity.setId(UUID.randomUUID());
        userEntity.setUserName(user.getUserName());
        userEntity.setDisplayName(user.getDisplayName());
        userEntity.setCreatedBy("postman");
        userEntity.setCreateDate(LocalTime.now().toString());

       userEntity= userRepository.save(userEntity);

       if(Objects.nonNull(userEntity)){
           return true;
       }

        return false;
    }

    @Override
    public UserDTO getUser(String userId) {
        UserDTO userDTO=null;
       UserEntity userEntity= userRepository.findByUserName(userId);
        if(Objects.nonNull(userEntity)){
         userDTO = new UserDTO();
         userDTO.setUserName(userId);
         userDTO.setDisplayName(userEntity.getDisplayName());
        }
        return userDTO;
    }
}
