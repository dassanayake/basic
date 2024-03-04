package org.lux.service.personal.basic.spring.boot.service.impl;

import org.lux.service.personal.basic.spring.boot.dto.UserBean;
import org.lux.service.personal.basic.spring.boot.entity.User;
import org.lux.service.personal.basic.spring.boot.repository.UserRepository;
import org.lux.service.personal.basic.spring.boot.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserBean> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserBean> userBeans = new ArrayList<>();
        userList.forEach(user -> {
            UserBean userBean = mapper.map(user, UserBean.class);
            userBeans.add(userBean);
        });
        return userBeans;
    }
}
