package com.demo.demo.pojo;

import com.demo.demo.pojo.dto.UserDto;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Table(name="test_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private  Integer userId;
    @Column(name="user_name")
    private String userName;
    private String password;
    private String email;
    @PostMapping
    public String addUser(@RequestBody UserDto user){
        return "success";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "user_id=" + userId +
//                ", user_name='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "tb_user{" +
                "user_id=" + userId +
                ", user_name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
