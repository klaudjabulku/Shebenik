package com.shebenik.egnatia.mappers;
import com.shebenik.egnatia.dto.BookATripReservationDto;
import com.shebenik.egnatia.entities.BookATripReservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookATripReservationMapper {
    BookATripReservationDto entityToDto (BookATripReservation bookATripReservation);
    BookATripReservation dtoToEntity (BookATripReservationDto bookATripReservationDto);
}
