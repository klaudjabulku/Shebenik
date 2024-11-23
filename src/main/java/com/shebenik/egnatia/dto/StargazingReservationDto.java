package com.shebenik.egnatia.dto;

import com.shebenik.egnatia.entities.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StargazingReservationDto extends BaseEntityDto{

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private double totalPrice;
    private int numberOfPeople;
    private Date startDate;
    private int numberOfNights;

    private Review review;
}
