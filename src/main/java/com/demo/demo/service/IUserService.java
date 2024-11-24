package com.demo.demo.service;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.UserDto;

import java.util.List;

public interface IUserService {
    /**
     * 插入用户
     * @param user
     */
    User add(UserDto user);

    /**
     * 查询用户
     * @param userId
     */
    User getUser(Integer userId);

    // /**
    //  * 查询所有用户
    //  * @return
    //  */
    // List<User> getUserAll();

    /**
     * 修改用户
     * @param user
     * @return
     */
    User editUser(UserDto user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    void deleteUser(Integer userId);
}
