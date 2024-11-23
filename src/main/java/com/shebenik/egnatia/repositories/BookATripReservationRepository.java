package com.shebenik.egnatia.repositories;


import com.shebenik.egnatia.entities.BookATripReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookATripReservationRepository extends JpaRepository<BookATripReservation, UUID> {
}
