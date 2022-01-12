package com.happy.lovely.presentation.api;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@ResponseBody
public class UserRestController {

    @GetMapping("/list")
    public String findUserList() {

        return "hello";
    }
}
