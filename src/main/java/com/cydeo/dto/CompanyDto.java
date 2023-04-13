package com.cydeo.dto;

import com.cydeo.enums.CompanyStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompanyDto {

    private long id;
    @NotBlank
    @Size(max = 200, min = 2)
    private String title;
    @NotBlank
    @Pattern(regexp = "^(\\+\\d{1,2}\\s)?((\\(\\d{3}\\))|(\\d{3}))[\\s.-]\\d{3}[\\s.-]\\d{4}$", message = "Phone Number is required field and may be in any valid phone number format.")
    private String phone;
    @Pattern(regexp = "^((http|https)://)[-a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)$",message = "Website should have a valid format.")
    private String website;
    @NotNull
    @Valid
    private AddressDto address;
    private CompanyStatus companyStatus;
}
