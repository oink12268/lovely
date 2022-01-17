package com.happy.lovely.presentation.api;


import com.happy.lovely.application.UserService;
import com.happy.lovely.presentation.dto.user.SignUpDto;
import com.happy.lovely.utils.TokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/app/v1/users")
@RequiredArgsConstructor
@ResponseBody
public class UserRestController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpDto signUpDto) {

        return userService.isEmailDuplicated(signUpDto.getEmail())
                ? ResponseEntity.badRequest().build()
                : ResponseEntity.ok(TokenUtils.generateJwtToken(userService.signUp(signUpDto)));
    }
}
