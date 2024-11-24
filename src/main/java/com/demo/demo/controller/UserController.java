package com.demo.demo.controller;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.ResponseMessage;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 接口方法返回对象 转换成 json 文本
@RequestMapping("/user") // localhost:8080/user
public class UserController {
    @Autowired
    IUserService userService;

    // 增加
    @PostMapping
    public ResponseMessage<User> addUser(@Validated @RequestBody UserDto user) {
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }

    // 删除
    // 修改
    @PutMapping
    public ResponseMessage<User> editUser(@Validated @RequestBody UserDto user) {
        User userNew = userService.editUser(user);
        return ResponseMessage.success(userNew);
    }

    // 查询
    @GetMapping("/{userId}")
    public ResponseMessage<User> getUser(@PathVariable("userId") Integer userId) {
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }
    // 删除
    @DeleteMapping
    public ResponseMessage<User> deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
        return ResponseMessage.success();
    }
}
