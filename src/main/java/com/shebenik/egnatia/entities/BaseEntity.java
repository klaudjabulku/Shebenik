package com.shebenik.egnatia.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", updatable = false, nullable = false)
    @JdbcType(VarcharJdbcType.class)
    protected UUID id;

    @Column(name = "create_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @PrePersist
    public void onPersist() {
        createdAt = Instant.now();
    }

    @PreUpdate
    public void onUpdate() {
        updatedAt = Instant.now();
    }
}

