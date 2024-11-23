package com.shebenik.egnatia.entities;

import jakarta.persistence.*;
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
public class BookATripReservation extends BaseEntity {

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
    @Column(name = "number_of_people")
    private int numberOfPeople;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "number_of_nights")
    private int numberOfNights;

    @OneToOne
    @JoinColumn(name = "id_book_a_trip_reservation", referencedColumnName = "id")
    private Review review;
    @ManyToOne
    @JoinColumn(name = "id_book_a_trip_reservation", insertable = false, updatable = false)
    private BookATrip bookATrip;

}
