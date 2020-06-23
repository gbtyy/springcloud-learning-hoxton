package com.gbt.springcloud.service;

import com.gbt.springcloud.entity.User;

import java.util.List;

public interface UserService {
    void insert(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> listUsersByIds(List<Long> ids);
}

