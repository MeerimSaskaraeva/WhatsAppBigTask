package classes;

import enums.City;
import enums.Gender;

import java.time.LocalDate;

public class Person {

    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private City placeOfBirth;
    private Gender gender;


    public Person(String lastName, String firstName, LocalDate dateOfBirth, City placeOfBirth, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
    }

    public Person() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public City getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(City placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return
                "\n                          lastName='" + lastName +
                "\n                          firstName='" + firstName +
                "\n                          dateOfBirth=" + dateOfBirth +
                "\n                          placeOfBirth=" + placeOfBirth +
                "\n                          gender=" + gender;
    }
}
