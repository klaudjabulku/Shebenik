package com.shebenik.egnatia.repositories;


import com.shebenik.egnatia.entities.Tents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TentsRepository extends JpaRepository<Tents, UUID> {
}
