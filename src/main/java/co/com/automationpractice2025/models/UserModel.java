package co.com.automationpractice2025.models;

import lombok.Data;

@Data
public class UserModel {

    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String city;
    private String postcode;
    private String phone;
    private String email;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String gender;

    public UserModel() {
        // Constructor vacío requerido por Jackson
    }

    public UserModel(String firstName, String lastName, String password, String address,
                     String city, String postcode, String phone, String email,
                     String birthDay, String birthMonth, String birthYear, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.gender = gender;
    }
}
