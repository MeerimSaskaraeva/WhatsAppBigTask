package service;

import classes.Passport;
import classes.Person;
import enums.City;

import java.util.List;

public interface PersonService {

    public String createPassport(List<Passport>personList);
    public List<Passport> getAllPassport();

    public String getPassportByFirstNane(String firstName);
    public void getAllCity(City[] cities);
}
