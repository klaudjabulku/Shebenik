package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.BaseEntityDto;
import com.shebenik.egnatia.dto.UserDto;
import com.shebenik.egnatia.entities.BaseEntity;
import com.shebenik.egnatia.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto entityToDto (User user);
    User DtoToEntity (UserDto userDto);
}
