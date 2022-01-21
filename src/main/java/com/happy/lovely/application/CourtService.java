package com.happy.lovely.application;

import com.happy.lovely.domain.court.CourtRepository;
import com.happy.lovely.domain.court.entity.Court;
import com.happy.lovely.presentation.dto.court.CourtDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CourtService {

    private final CourtRepository courtRepository;
    private final CourtMapper courtMapper;

    @Transactional
    public Long addCourt(CourtDto courtDto) {
        Court court = courtMapper.mapFrom(courtDto);

        courtRepository.save(court);

        return court.getIdx();
    }
}
