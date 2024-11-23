package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.StargazingDto;
import com.shebenik.egnatia.entities.Stargazing;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StargazingReservationMapper {
    StargazingDto entityToDto (Stargazing stargazing);
    Stargazing DtoToEntity (StargazingDto stargazingDto);
}
