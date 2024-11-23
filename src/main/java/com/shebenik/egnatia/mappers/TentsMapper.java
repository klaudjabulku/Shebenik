package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.TentsDto;
import com.shebenik.egnatia.entities.Tents;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TentsMapper {
    TentsDto entityToDto (Tents tents);
    Tents DtoToEntity (TentsDto tentsDto);
}
