package service.impl;

import classes.Passport;
import classes.Person;
import enums.City;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;


public class PersonImpl implements PersonService{
    List<Passport> passports=new ArrayList<>();

    @Override
    public String createPassport(List<Passport> personList) {

        this.passports.addAll(personList);
        return "\n           Passport created successfully" +
                        "                                    ";

    }
    @Override
    public List<Passport> getAllPassport() {
        if (this.passports.isEmpty()){
            System.out.println("There is no  passport in the base!!!");
        }else {
        System.out.println("=========================== ALL PERSON WITH PASSPORT ==========================");
         }
        return passports;
    }


    @Override
    public String getPassportByFirstNane(String firstName) {
        for (Passport p:passports) {
            for (Person r:p.getPersonSet()) {
            if (r.getFirstName().equals(firstName)){
                return( "              " +
                        "         \n                            First name: " + r.getFirstName() +
                        "         \n                            ID: " + p.getId() +
                        "         \n                            Last name:" + r.getLastName() +
                        "         \n                            Date of birth: " + r.getDateOfBirth() +
                        "         \n                            Place of birth: " + r.getPlaceOfBirth() +
                        "         \n                            Gender: " + r.getGender());}
            }
        }
        return "Person with name "+firstName+" not found!";
    }

    @Override
    public void getAllCity(City[] cities) {

        for (City city : cities) {
            System.out.println(city.name());
        }

    }
}
