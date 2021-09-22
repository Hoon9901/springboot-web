package com.example.springbootstudyweb.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);   // 이메일을 통해 가입되었는지 확인하는 메소드
}
