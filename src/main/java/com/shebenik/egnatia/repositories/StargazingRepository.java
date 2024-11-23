package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.Stargazing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StargazingRepository extends JpaRepository<Stargazing, UUID> {
}
