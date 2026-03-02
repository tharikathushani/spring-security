package com.securityProject.securityProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "user-id", length = 45)
    private int userId;

//    @Column(name = "user_email", length = 65)
    private String email;

//    @Column(name = "user_password", length = 65)
    private  String password;

//    @Column(name = "user_role", length = 45)
    private  String role;

}
