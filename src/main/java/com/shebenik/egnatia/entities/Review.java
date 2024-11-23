package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "shee_review")
public class Review extends BaseEntity {
    @Column (name = "rating")
    private int rating;
    @Column (name = "feedback")
    private String feedback;

}
