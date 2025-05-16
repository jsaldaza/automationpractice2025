package co.com.automationpractice2025.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserModel {

    private final String firstName;
    private final String lastName;
    private final String password;
    private final String address;
    private final String city;
    private final String postcode;
    private final String phone;
    private final String email;
    private final String birthDay;
    private final String birthMonth;
    private final String birthYear;
    private final String gender; // "male" o "female"
}
