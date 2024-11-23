package com.shebenik.egnatia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class TentReservation extends BaseEntity{

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "number_of_nights")
    private int numberOfNights;
    @Column(name = "number_of_tents")
    private int numberOfTents;
    @Column(name = "start_date")
    private Date startDate;
    @ManyToOne
    @JoinColumn(name = "id_tent_reservation", insertable = false, updatable = false)
    private Tents tents;
}
