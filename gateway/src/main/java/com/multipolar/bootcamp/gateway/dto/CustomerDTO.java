package com.multipolar.bootcamp.gateway.dto;
import org.springframework.data.annotation.Id;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class CustomerDTO implements Serializable {
    @Id
    private String id;
    private String nik;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private MembershipStatus membershipStatus;
    private Address address;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Address implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}

enum MembershipStatus {
    FREE,
    STANDARD,
    PREMIUM,
    VIP
}
