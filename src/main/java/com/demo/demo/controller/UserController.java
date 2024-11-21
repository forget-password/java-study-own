package com.demo.demo.controller;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.ResponseMessage;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 接口方法返回对象 转换成 json 文本
@RequestMapping("/user") // localhost:8080/user
public class UserController {
    @Autowired
    IUserService userService;

    // 增加
    @PostMapping
    public ResponseMessage<User> addUser(@Validated @RequestBody UserDto user) {
        User userNew=userService.add(user);
        return ResponseMessage.success(userNew);
    }
    // 删除
//    修改
//    查询 

}
