package com.atguigu.springboot_crud.dao;

import com.atguigu.springboot_crud.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where username=#{username}  and password=#{password}")
    public User userLogin(@Param("username") String username, @Param("password") String password);


}
