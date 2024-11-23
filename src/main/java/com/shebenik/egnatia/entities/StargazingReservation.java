package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class StargazingReservation extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "number_of_people")
    private int numberOfPeople;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "number_of_nights")
    private int numberOfNights;

    @OneToOne
    @JoinColumn (name = "id_stargazing_reservation", referencedColumnName = "id")
    private Review review;

}
