package com.securityProject.securityProject.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
@CrossOrigin
public class AccountController {

    @GetMapping("/my-account")
    public String getAccountDetails() {
        return "This is the account details";
    }
}


