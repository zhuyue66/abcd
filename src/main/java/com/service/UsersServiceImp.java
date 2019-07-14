package com.service;

import com.bean.Users;
import com.dao.UsersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:07 2019/7/6
 */
@Service
public class UsersServiceImp implements UsersService {

    @Resource(name = "usersMapper")
    UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer userId) {
        return null;
    }

    @Override
    public List<Users> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }

    @Override
    public Users selectByUsers(Users record) {
        return usersMapper.selectByUsers(record);
    }
}
