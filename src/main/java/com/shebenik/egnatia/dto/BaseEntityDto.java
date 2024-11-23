package com.shebenik.egnatia.dto;


import java.time.Instant;
import java.util.UUID;

public class BaseEntityDto {

    protected UUID id;
    private Instant createdAt;
    private Instant updatedAt;
}
