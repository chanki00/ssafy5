package com.ssafy.ssafy_5_Trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.ssafy_5_Trip.domain.User;
import com.ssafy.ssafy_5_Trip.dto.UserSignupDto;
import com.ssafy.ssafy_5_Trip.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    
    // 로그인 페이지 요청
    @GetMapping("/login")
    public String loginForm() {
        return "user/login";
    }

    // 회원가입 페이지 요청
    @GetMapping("/signup")
    public String signUpForm() {
        return "user/signup";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute UserSignupDto dto) {
        User user = new User(dto.getUserId(), dto.getPw(), dto.getUserName(), dto.getEmail());
        userService.save(user);
        return "redirect:/user/login";
    }
}
