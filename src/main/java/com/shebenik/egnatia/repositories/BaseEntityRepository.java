package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BaseEntityRepository extends JpaRepository<BaseEntity, UUID> {
}
