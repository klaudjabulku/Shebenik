package com.shebenik.egnatia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TentsDto extends BaseEntityDto{

    private int numberOfTents;
    private int tentSize;
    private double price;
}
