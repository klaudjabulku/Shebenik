package com.shebenik.egnatia.dto;

import com.shebenik.egnatia.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto extends BaseEntityDto{

    private String name;
    private String lastName;
    private Date birthday;
    private String email;
    private String phone;
    private String password;
    private String repeatedPassword;
    private UserRole userRole;
}
