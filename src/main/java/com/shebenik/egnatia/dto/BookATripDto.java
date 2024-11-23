package com.shebenik.egnatia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookATripDto extends BaseEntityDto{

    private double price;
    private int slots;
    private Date startDate;
    private int numberOfDays;
    private String description;
    private String itinerary;
}
