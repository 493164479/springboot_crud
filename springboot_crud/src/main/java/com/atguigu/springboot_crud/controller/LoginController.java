package com.atguigu.springboot_crud.controller;

import com.atguigu.springboot_crud.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/user/login")
    public String userLogin(){
        return "login";
    }

    @PostMapping("/user/login")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            Map<String,Object> map, HttpSession session){

        if(loginService.userLogin(username,password) == true){
            session.setAttribute("userlogin",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }

}
