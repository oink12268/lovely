package com.happy.lovely.presentation.api;

import com.happy.lovely.application.CourtService;
import com.happy.lovely.domain.court.CourtRepository;
import com.happy.lovely.domain.court.entity.Court;
import com.happy.lovely.presentation.dto.court.CourtDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/app/v1/courts")
@RequiredArgsConstructor
@ResponseBody
public class CourtRestController {

    private final CourtRepository courtRepository;
    private final CourtService courtService;

    @GetMapping
    public ResponseEntity<List<Court>> findCourtList() {

        return ResponseEntity.ok().body(courtRepository.findAll());
    }
    @GetMapping("/{idx}")
    public ResponseEntity<Court> findCourDetail(@PathVariable Long idx) {

        return ResponseEntity.ok().body(courtRepository.findById(idx).get());
    }

    @PostMapping
    public void addCourt(@RequestBody CourtDto courtDto) {
        courtService.addCourt(courtDto);
    }
}
