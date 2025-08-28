package com.example.user_crud_management.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name" ,length = 30, nullable = false)
    private String firstname;
    @Column(name = "last_name",length = 30,nullable = false)
    private String lastname;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone",nullable = false)
    private String phone;
}
