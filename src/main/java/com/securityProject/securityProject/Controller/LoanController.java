package com.securityProject.securityProject.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/loan")
@CrossOrigin
public class LoanController {

    @GetMapping("/my-loan")
    public String getLoan(){
        return "This is the loan details";
    }

}
