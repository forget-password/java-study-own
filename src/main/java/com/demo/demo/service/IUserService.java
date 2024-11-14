package com.demo.demo.service;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    User add(UserDto user);
}
