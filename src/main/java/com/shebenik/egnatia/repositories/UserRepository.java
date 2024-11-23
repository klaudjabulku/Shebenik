package com.shebenik.egnatia.repositories;

import com.shebenik.egnatia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
