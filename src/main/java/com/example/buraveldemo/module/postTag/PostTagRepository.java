package com.example.buraveldemo.module.postTag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface PostTagRepository extends JpaRepository<PostTag,Long> {
}
