package co.com.automationpractice2025.builders;

import co.com.automationpractice2025.models.UserModel;

public class UserBuilder {

    private String firstName = "Juan";
    private String lastName = "Salazar";
    private String password = "123456";
    private String address = "Automation St. 123";
    private String city = "Medellin";
    private String postcode = "00000";
    private String phone = "1234567890";
    private String email = generateRandomEmail();
    private String birthDay = "7"; // valor por defecto, puede ajustarse según test
    private String birthMonth = "5"; // mayo
    private String birthYear = "1990";

    public static UserBuilder defaultUser() {
        return new UserBuilder();
    }

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public UserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    private static String generateRandomEmail() {
        long timestamp = System.currentTimeMillis();
        return "test_user_" + timestamp + "@mail.com";
    }

    public UserBuilder withBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public UserBuilder withBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    private String gender = "male";

    public UserBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public UserModel build() {
        return new UserModel(firstName, lastName, password, address, city, postcode, phone, email, birthDay, birthMonth, birthYear, gender);
    }
}
