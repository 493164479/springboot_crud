package com.atguigu.springboot_crud.service;

import com.atguigu.springboot_crud.dao.UserDao;
import com.atguigu.springboot_crud.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserDao userDao ;

    public boolean userLogin(@Param("username") String username, @Param("password") String password){
        User user = userDao.userLogin(username, password);
        if(user!=null){
            return true;
        }else {
            return false;
        }
    }
}
