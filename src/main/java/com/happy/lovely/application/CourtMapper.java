package com.happy.lovely.application;

import com.happy.lovely.domain.court.entity.Court;
import com.happy.lovely.presentation.dto.court.CourtDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CourtMapper {


    public Court mapFrom (CourtDto courtDto) {
        Court court = Court.builder()
                .name(courtDto.getName())
                .phone(courtDto.getPhone())
                .build();

        return court;
    }
}
