package iss.team1.ca.memorygame.boot.service.impl;

import iss.team1.ca.memorygame.boot.bean.User;
import iss.team1.ca.memorygame.boot.mapper.UserMapper;
import iss.team1.ca.memorygame.boot.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createAccount(User user) {
        userMapper.createAccount(user);
    }
}
