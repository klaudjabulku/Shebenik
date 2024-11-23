package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.TentReservationDto;
import com.shebenik.egnatia.entities.TentReservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TentReservationMapper {

    TentReservationDto entityToDto (TentReservation tentReservation);
    TentReservation DtoToEntity (TentReservationDto tentReservationDto);
}
