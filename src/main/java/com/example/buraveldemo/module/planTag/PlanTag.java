package com.example.buraveldemo.module.planTag;

import com.example.buraveldemo.module.plan.Plan;
import com.example.buraveldemo.module.tag.Tag;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanTag {
    @Id
    @GeneratedValue
    @Column(name = "plantag_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Tag tag;

    @ManyToOne(fetch = FetchType.LAZY)
    private Plan plan;
}
