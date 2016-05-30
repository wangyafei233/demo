package com.zb.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import com.zb.dao.UserDao;
import com.zb.entity.User;


/**
 * 
 * 
 * 作者: zhoubang 
 * 日期：2015年9月25日 上午9:01:20
 */
@SuppressWarnings("unchecked")
@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDao {

	@Resource(name = "sqlSession")
	//也可以直接使用@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<User> getAll() {
		List<User> list = (List<User>) sqlSession.selectList("findAll");
		return list;
	}

}
