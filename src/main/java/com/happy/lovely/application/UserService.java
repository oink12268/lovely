package com.happy.lovely.application;

import com.happy.lovely.domain.user.UserRepository;
import com.happy.lovely.domain.user.entity.User;
import com.happy.lovely.enums.roles.UserRole;
import com.happy.lovely.presentation.dto.user.SignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User signUp(SignUpDto signUpDto) {
        User user = User.builder()
                .email(signUpDto.getEmail())
                .pw(passwordEncoder.encode(signUpDto.getPw()))
                .role(UserRole.ROLE_USER)
                .isEnable(true)
                .build();

        return userRepository.save(user);
    }

    public boolean isEmailDuplicated(String email) {
        return userRepository.existsByEmail(email);
    }

}
