package com.sarac.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    //@NotNull  Field should not be null
    //@NotEmpty Field should not be empty ""
    //@NotBlank Field should not be blank "   "(Cover Not empty and not null as well)

    @NotBlank
    @Size(max=12,min=2)
    private String firstName;
    @NotBlank
    @Size(max=12,min=2)
    private String lastName;

    //thymleaf accepts yyyy-mm-dd but localDate mm-dd-yy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate birthDay;
    @NotBlank
    @Pattern(regexp = "^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$")
    private String password;
    @NotBlank
    @Pattern(regexp ="^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$")
    private String email;
    @NotBlank
    private String address;
    @NotBlank
    private String address2;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String zipCode;


}
