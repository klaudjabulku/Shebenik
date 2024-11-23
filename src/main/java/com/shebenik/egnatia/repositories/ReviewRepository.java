package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
