package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "shee_tents")
public class Tents extends BaseEntity {

    @Column(name = "number_of_tents")
    private int numberOfTents;
    @Column(name = "tent_size")
    private int tentSize;
    @Column(name = "price")
    private double price;
}
