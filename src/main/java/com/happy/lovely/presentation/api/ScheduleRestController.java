package com.happy.lovely.presentation.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app/v1/schedules")
@RequiredArgsConstructor
@ResponseBody
public class ScheduleRestController {

    @GetMapping
    public String findScheduleList() {

        return "hello";
    }
}
