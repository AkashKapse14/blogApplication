package com.blog.blog.dao;

import com.blog.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Integer> {
}
