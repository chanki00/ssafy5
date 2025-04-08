package com.ssafy.ssafy_5_Trip.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY 전략을 사용하여 자동 증가
    private Integer id; // 사용자 ID (PK)
    @Column(name="user_id", nullable = false, length = 20) // 사용자 ID는 유일해야 함
    private String userId;
    @Column(name="pw", nullable = false, length = 20)
    private String pw;
    @Column(name="user_name", nullable = false, length = 20)
    private String userName;
    @Column(unique = true) // 이메일은 유일해야 함
    private String email;

    public User() {
    }

    public User(String userId, String pw, String userName, String email) {
        this.userId = userId;
        this.pw = pw;
        this.userName = userName;
        this.email = email;
    }
}
