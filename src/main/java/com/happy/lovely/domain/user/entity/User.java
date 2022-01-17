package com.happy.lovely.domain.user.entity;

import com.happy.lovely.enums.roles.UserRole;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Setter
    @Column(name = "password", nullable = false)
    private String pw;

    @Setter
    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Setter
    @Column(name = "is_enable", nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean isEnable = true;                        // 사용 여부

}
