package com.happy.lovely.presentation.api;

import com.happy.lovely.domain.court.CourtRepository;
import com.happy.lovely.domain.court.entity.Court;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/app/v1/courts")
@RequiredArgsConstructor
@ResponseBody
public class CourtRestController {

    private final CourtRepository courtRepository;

    @GetMapping
    public ResponseEntity<List<Court>> findCourtList() {

        return ResponseEntity.ok().body(courtRepository.findAll());
    }
}
