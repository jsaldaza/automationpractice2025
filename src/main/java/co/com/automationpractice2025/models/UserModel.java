package co.com.automationpractice2025.models;

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

    public UserModel(String firstName, String lastName, String password, String address,
                     String city, String postcode, String phone, String email, String birthDay, String birthMonth, String birthYear, String gender) {
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

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }
}
