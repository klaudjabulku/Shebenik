package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.BookATripDto;
import com.shebenik.egnatia.dto.ReviewDto;
import com.shebenik.egnatia.entities.BookATrip;
import com.shebenik.egnatia.entities.Review;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewDto entityToDto (Review review);
    Review DtoToEntity (ReviewDto reviewDto);
}
