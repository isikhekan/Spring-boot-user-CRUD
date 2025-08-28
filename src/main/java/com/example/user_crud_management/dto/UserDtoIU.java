package com.example.user_crud_management.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoIU {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
}
