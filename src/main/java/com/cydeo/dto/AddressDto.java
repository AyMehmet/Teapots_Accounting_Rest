package com.cydeo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private Long id;
    @NotBlank
    @Size(max=100, min=2)
    private String addressLine1;

    @Size(max=100)
    private String addressLine2;
    @NotBlank(message = "City is a required field.")
    @Size(max=50, min=2, message = "City should have 2-50 characters long.")
    private String city;
    @NotBlank(message = "City is a required field.")
    @Size(max=50, min=2, message = "City should have 2-50 characters long.")
    private String state;
    @NotBlank
    private String country;
    @Pattern(regexp ="^\\d{5}(?:[-\\s]\\d{4})?$" , message = "Zipcode should have a valid form.")
    private String zipCode;
}
