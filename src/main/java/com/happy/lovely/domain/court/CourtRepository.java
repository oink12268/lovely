package com.happy.lovely.domain.court;

import com.happy.lovely.domain.court.entity.Court;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Court, Long> {
}
