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
public class StargazingDto extends BaseEntityDto{

    private String description;
    private Date date;
    private double price;
}
