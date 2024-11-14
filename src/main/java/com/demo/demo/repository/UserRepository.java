package com.demo.demo.repository;

import com.demo.demo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // spring 的 bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
