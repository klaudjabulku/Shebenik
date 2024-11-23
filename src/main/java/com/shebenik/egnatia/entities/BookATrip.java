package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class BookATrip extends BaseEntity {

    @Column(name = "price")
    private double price;
    @Column(name = "slots")
    private int slots;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "number_of_days")
    private int numberOfDays;
    @Column(name = "description")
    private String description;
    @Column(name = "itinerary")
    private String itinerary;

}
