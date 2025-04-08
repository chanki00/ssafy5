package com.ssafy.ssafy_5_Trip.service;

import java.util.List;
import java.util.Optional;

import com.ssafy.ssafy_5_Trip.domain.User;

public interface UserService {
    User save(User user);
    Optional<User> findById(Integer id);
    List<User> findAll();
    User update(Integer id, User updateUser);
    void deleteById(Integer id);
}
