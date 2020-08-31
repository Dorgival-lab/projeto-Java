package me.zhulin.shopapi.service;


import me.zhulin.shopapi.entity.User;

import java.util.Collection;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
