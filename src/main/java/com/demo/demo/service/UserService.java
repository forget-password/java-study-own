package com.demo.demo.service;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // spring 的 bean
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);
    }
}
