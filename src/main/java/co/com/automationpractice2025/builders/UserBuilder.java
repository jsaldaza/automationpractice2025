package co.com.automationpractice2025.builders;

import co.com.automationpractice2025.models.UserModel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor(staticName = "defaultUser")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Accessors(chain = true)
public class UserBuilder {

    String firstName = "Juan";
    String lastName = "Salazar";
    String password = "123456";
    String address = "Automation St. 123";
    String city = "Medellin";
    String postcode = "00000";
    String phone = "1234567890";
    String email = generateRandomEmail();
    String birthDay = "7";
    String birthMonth = "5";
    String birthYear = "1990";
    String gender = "male";

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

    public UserBuilder withBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public UserBuilder withBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public UserBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public UserModel build() {
        return new UserModel(
                firstName, lastName, password, address,
                city, postcode, phone, email,
                birthDay, birthMonth, birthYear, gender
        );
    }

    private static String generateRandomEmail() {
        long timestamp = System.currentTimeMillis();
        return "test_user_" + timestamp + "@mail.com";
    }
}
