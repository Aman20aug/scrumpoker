package com.scrum.Scrumboard.controller;


import com.scrum.Scrumboard.DTO.LoginDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<Boolean> isValidCredential(@RequestBody LoginDTO login){

        if("admin".equalsIgnoreCase(login.getUserName())&& "password".equalsIgnoreCase(login.getPassword())){
            return  new ResponseEntity<>(true, HttpStatus.OK);
        }

        return  new ResponseEntity<>(false, HttpStatus.FORBIDDEN);
    }

}
