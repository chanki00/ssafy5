package com.ssafy.ssafy_5_Trip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.ssafy_5_Trip.domain.User;
import com.ssafy.ssafy_5_Trip.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User update(Integer id, User updateUser) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 id의 사용자가 존재하지 않습니다."));
        user.setUserId(updateUser.getUserId());
        user.setPw(updateUser.getPw());
        user.setUserName(updateUser.getUserName());
        user.setEmail(updateUser.getEmail());

        return user;
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("해당 id의 사용자가 존재하지 않습니다.");
        }

        userRepository.deleteById(id);
    }
    
}
