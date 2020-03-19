package com.crud.springboot.user.service;

import com.crud.springboot.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    //查询全部
    List<UserEntity> getAll(Map map);

    //删除
    void dellById(Integer id);

    //保存用户
    void save(UserEntity userEntity);
}
