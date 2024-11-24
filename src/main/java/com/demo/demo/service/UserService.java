package com.demo.demo.service;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // spring 的 bean
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository; // 自动装配进来

    @Override
    public User add(UserDto user) {
        User userPojo = new User();
        // 利用 spring 提供的 工具把里面的属性拷贝一份，
        // 把 userdto 中的内容拷贝到 userPojo
        BeanUtils.copyProperties(user, userPojo);

        // 在这里不能直接传递 userdto， 因为我们在 userRepository指定的是 user 类型
        return userRepository.save(userPojo);  // 调用 save 方法。自动判定，有 ID 就是修改，没有 ID 就是新增
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> {
            return new IllegalCallerException("用户不存在，参与异常！");
        });
    }

    @Override
    public User editUser(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void deleteUser(Integer userId) {
         userRepository.deleteById(userId) ;
    }

    @Override
    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }
}
