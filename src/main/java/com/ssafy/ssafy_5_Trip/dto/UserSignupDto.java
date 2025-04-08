package com.ssafy.ssafy_5_Trip.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignupDto {

    private int id;
    private String userId;
    private String pw;
    private String userName;
    private String email;

    public UserSignupDto() {
    }

    public UserSignupDto(String userId, String pw, String userName, String email) {
        this.userId = userId;
        this.pw = pw;
        this.userName = userName;
        this.email = email;
    }
}
