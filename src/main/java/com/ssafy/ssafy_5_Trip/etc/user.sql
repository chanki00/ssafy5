create database ssafy;

CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user_id  VARCHAR(20), #회원 아이디
	user_name VARCHAR(20) NOT NULL, #회원 이름
    pw VARCHAR(20) NOT NULL, #회원 비밀번호
    email VARCHAR(20) unique NOT NULL # 회원 이메일
);

DROP TABLE user;