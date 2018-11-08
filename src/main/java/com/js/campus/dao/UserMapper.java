package com.js.campus.dao;

import com.js.campus.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectByLoginName(String LoginName);
}