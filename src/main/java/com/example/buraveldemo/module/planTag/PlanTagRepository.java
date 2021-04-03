package com.example.buraveldemo.module.planTag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface PlanTagRepository extends JpaRepository<PlanTag,Long> {
}
