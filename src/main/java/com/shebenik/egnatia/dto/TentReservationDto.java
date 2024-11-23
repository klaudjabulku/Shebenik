package com.shebenik.egnatia.dto;

import com.shebenik.egnatia.entities.Tents;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TentReservationDto extends BaseEntityDto{

    private String name;
    private String surname;
    private String email;
    private String phone;
    private double totalPrice;
    private int numberOfNights;
    private int numberOfTents;
    private Date startDate;
    private Tents tents;
}
