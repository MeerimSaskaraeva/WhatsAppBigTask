package service;

import classes.Passport;
import classes.Person;
import classes.Profile;
import classes.Whatsapp;
import enums.Status;

import java.util.List;

public interface WhatsappService {


    List<Profile> getAllWhatsapp();

    void getWhatsappStatus(Status[]statuses);
    String installWhatsapp(long id,List<Profile>profiles, List<Passport>passportList,List<Whatsapp>whatsappList);

    String changeStatus(String password,Status status);
    String addContact();
}
