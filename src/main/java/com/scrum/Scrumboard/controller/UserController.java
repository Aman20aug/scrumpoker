package com.scrum.Scrumboard.controller;


import com.scrum.Scrumboard.DTO.UserDTO;
import com.scrum.Scrumboard.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping(name = "CreateUser",consumes = "application/json",path = "user")
    public ResponseEntity<String> createUser(@RequestBody UserDTO user){

        boolean isUserCreated=userService.createUser(user);
        if(isUserCreated){
            return new ResponseEntity<String>("Success", HttpStatus.CREATED);
        }
        return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
    }

    @GetMapping(name="GetUser" , path = "user/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("userId") String userId){

        UserDTO user = userService.getUser(userId);

        if(Objects.nonNull(user)){
            return new ResponseEntity<>(user,HttpStatus.FOUND);
        }

        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

}
