package com.securityProject.securityProject.Controller;

import com.securityProject.securityProject.Model.User;
import com.securityProject.securityProject.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class LoginController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> userRegister(@RequestBody User user){
        ResponseEntity response =null;
        try {
            String hashPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashPassword);
            User savedUser = userRepo.save(user);
            if(savedUser.getUserId()>0){
                response =ResponseEntity.status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }

        } catch (Exception e) {
            response = ResponseEntity.status(HttpStatus.CREATED)
                    .body("An Exception occurred due to " + e.getMessage());
        }
         return  response;
    }
}
