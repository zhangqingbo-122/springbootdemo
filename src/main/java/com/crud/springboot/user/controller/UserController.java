package com.crud.springboot.user.controller;


import com.crud.springboot.user.entity.UserEntity;
import com.crud.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/dellById")
    public String dellById(Integer id) {
        userService.dellById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return "注册成功Ok";
    }
}
