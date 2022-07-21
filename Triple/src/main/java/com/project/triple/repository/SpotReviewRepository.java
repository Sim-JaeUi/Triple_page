package com.project.triple.repository;

import com.project.triple.model.entity.SpotReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotReviewRepository extends JpaRepository<SpotReview, Long> {
}
