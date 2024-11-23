package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.TentReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TentReservationRepository extends JpaRepository<TentReservation, UUID> {
}
