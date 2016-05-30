package com.zb.service;

import java.util.List;

import com.zb.entity.User;


/**
 * 
 * 
 * 作者: zhoubang 
 * 日期：2015年9月25日 上午9:02:05
 */
public interface UserService {
    
    /**
     * 获取所有用户列表
     * 
     * 作者: zhoubang 
     * 日期：2015年9月25日 上午9:02:09
     * @return
     */
    List<User> getAll();
}
