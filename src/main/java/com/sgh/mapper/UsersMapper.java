package com.sgh.mapper;

import com.sgh.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
   void insertUser(Users users);
}
