package com.shebenik.egnatia.mappers;

import com.shebenik.egnatia.dto.BookATripDto;
import com.shebenik.egnatia.dto.UserDto;
import com.shebenik.egnatia.entities.BookATrip;
import com.shebenik.egnatia.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookATripMapper {
    BookATripDto entityToDto (BookATrip bookATrip);
    BookATrip DtoToEntity (BookATripDto bookATripDto);
}
