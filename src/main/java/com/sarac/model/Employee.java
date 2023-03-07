package com.sarac.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String firstName;
    private String lastName;

    //thymleaf accepts yyyy-mm-dd but localDate mm-dd-yy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;
    private String password;
    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
