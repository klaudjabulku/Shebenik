package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.BaseEntityDto;
import com.shebenik.egnatia.entities.BaseEntity;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface BaseEntityMapper {
    BaseEntityDto entityToDto (BaseEntity baseEntity);
    BaseEntity DtoToEntity (BaseEntityDto baseEntityDto);

}
