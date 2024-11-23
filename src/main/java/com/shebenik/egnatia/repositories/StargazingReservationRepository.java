package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.StargazingReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StargazingReservationRepository extends JpaRepository<StargazingReservation, UUID> {
}
