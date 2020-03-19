package com.crud.springboot.user.service.impl;


import com.crud.springboot.user.dao.UserDao;
import com.crud.springboot.user.entity.UserEntity;
import com.crud.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询全部
     * @param map
     * @return
     */
    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void dellById(Integer id) {
        userDao.dellById(id);
    }

    /**
     * 保存用户
     * @param userEntity
     */
    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);
    }
}
