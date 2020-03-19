package com.crud.springboot.user.dao;

import com.crud.springboot.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    //查询全部
    List<UserEntity> getAll(Map map);

    //删除
    void dellById(Integer id);

    //保存用户
    void save(UserEntity userEntity);
}
