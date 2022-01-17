package com.happy.lovely.domain.user;

import com.happy.lovely.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPw(String email, String pw);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
