package com.shebenik.egnatia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReviewDto extends BaseEntityDto{

    private int rating;
    private String feedback;
}
