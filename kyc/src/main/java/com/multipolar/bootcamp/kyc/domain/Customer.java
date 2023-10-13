package com.multipolar.bootcamp.kyc.domain;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class Customer implements Serializable {
    @Id
    private String id;
    @NotEmpty(message = "nik cannot be empty")
    @Length(min=16,message = "jumlah digit harus 16")
    private String nik;
    private String firstName;
    @NotEmpty(message = "Last Name cannot be empty")
    private String lastName;
    @NotEmpty(message = "email cannot be empty")
    @Email(message = "Format email tidak benar")
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private MembershipStatus membershipStatus;
    private Address address;
}
