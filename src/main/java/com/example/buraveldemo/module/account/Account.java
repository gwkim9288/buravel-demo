package com.example.buraveldemo.module.account;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    private String nickname;

    private String password;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    @Email
    @Column(unique = true)
    private String email;

    private String emailCheckToken;

    private boolean emailVerified;

    private LocalDateTime emailCheckTokenGeneratedAt;

}
