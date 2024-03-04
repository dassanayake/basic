package org.lux.service.personal.basic.spring.boot.service;

import org.lux.service.personal.basic.spring.boot.dto.UserBean;

import java.util.List;

public interface UserService {

    List<UserBean> getAllUsers();
}
