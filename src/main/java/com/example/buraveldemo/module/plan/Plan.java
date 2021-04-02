package com.example.buraveldemo.module.plan;

import com.example.buraveldemo.module.account.Account;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    @Id
    @GeneratedValue
    @Column(name = "plan_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account planManager;

    @Column(nullable = false)
    private String planTitle;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String planImage;

    private boolean closed;

    @Column(nullable = false)
    private LocalDateTime startDate;

    private LocalDateTime endDate;

    //todo 카테고리별 totalPrice 6개
    /**
     * 카테고리별 가격을 크기순으로 정렬은쉬운데
     * 결국 리턴해야하는것은 어느 카테고리가 얼마인지 3등까지 정렬해서
     * hashmap으로 <가격,카테고리> value값으로 정렬 풀어가면될듯
     * */

}
