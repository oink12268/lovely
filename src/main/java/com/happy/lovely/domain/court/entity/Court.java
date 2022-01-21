package com.happy.lovely.domain.court.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 코트명
     */
    @Column(nullable = false, length = 200)
    private String name;

    /**
     * 전화번호
     */
    @Column(length = 200)
    private String phone;

    @Builder
    public Court(Long idx, String name, String phone) {
        this.idx = idx;
        this.name = name;
        this.phone = phone;
    }
}
