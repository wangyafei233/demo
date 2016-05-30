package com.zb.dao;

import java.util.List;

import com.zb.entity.User;

/**
 * 
 * 
 * 作者: zhoubang 
 * 日期：2015年9月25日 上午9:01:28
 */
public interface UserDao {
    
    /**
     * 获取所有用户列表
     * 
     * 作者: zhoubang 
     * 日期：2015年9月25日 上午9:02:20
     * @return
     */
    List<User> getAll();
}
