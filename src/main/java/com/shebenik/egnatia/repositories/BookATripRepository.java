package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.BookATrip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookATripRepository extends JpaRepository<BookATrip, UUID> {
}
