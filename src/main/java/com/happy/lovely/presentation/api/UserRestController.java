package com.happy.lovely.presentation.api;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@ResponseBody
public class UserRestController {

    final private static Logger LOG = Logger.getGlobal();

    @GetMapping("/list")
    public String findUserList() {

        return "hello";
    }

    @GetMapping("/login")
    public void login() {
        LOG.info("GET successfully called on /login resource");
    }
}
