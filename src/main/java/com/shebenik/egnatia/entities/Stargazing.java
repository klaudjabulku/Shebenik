package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "shee_stargazing")
public class Stargazing extends BaseEntity{

    @Column(name = "description")
    private String description;
    @Column(name = "stargazing_date")
    private Date date;
    @Column(name = "price")
    private double price;
}
