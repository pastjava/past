package com.sgh.service;

import com.sgh.mapper.UsersMapper;
import com.sgh.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class UsersService {
    @Autowired(required = false)
    private UsersMapper usersmapper;

    public void addUser(Users users) {
        this.usersmapper.insertUser(users);
    }
}
