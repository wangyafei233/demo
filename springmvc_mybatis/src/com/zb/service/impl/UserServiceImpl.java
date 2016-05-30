package com.zb.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zb.dao.UserDao;
import com.zb.entity.User;
import com.zb.service.UserService;


/**
 * 
 * 
 * 作者: zhoubang 
 * 日期：2015年9月25日 上午9:01:56
 */
@Service(value = "userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao userDaoImpl;

    @Override
    public List<User> getAll() {
        return userDaoImpl.getAll();
    }

}
