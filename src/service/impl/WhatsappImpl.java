package service.impl;

import classes.Passport;
import classes.Profile;
import classes.Whatsapp;
import enums.Status;
import service.WhatsappService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WhatsappImpl implements WhatsappService {
    Scanner sc=new Scanner(System.in);
    List<Profile>profileList=new ArrayList<>();
    //List<Whatsapp>whatsappList=new ArrayList<>();

    @Override
    public String installWhatsapp(long id, List<Profile>profiles, List<Passport>passportList,List<Whatsapp>whatsappList) {
        for (Passport pass : passportList) {
            if (pass.getId()==id){
                this.profileList.addAll(profiles);
                return "Whatsapp installed successfully: ";
            }
        }
        return "Not found ID ";
    }

    @Override
    public String changeStatus(String password,Status status) {
        for (Profile profile : profileList) {
            for (Whatsapp whatsapp : profile.getWhatsappList()) {
               if( whatsapp.getPassword().equals(password) ){
                   System.out.println("Current status: "+profile.getStatus().name());

                   profile.getStatus().clear();
                   System.out.println("User name: "+profile.getUserName()+
                           "\nNew status: "+profile.setStatus(status).name());

                   return "Status changed successfully!!!!!!!!!!!";
               }
            }
        }

        return "Not found password";
    }

    @Override
    public List<Profile> getAllWhatsapp() {
        if (this.profileList.isEmpty()){
            System.out.println("Not profile");
        }else {
            System.out.println("======================== ALL PROFILE =========================");
        }
        return profileList;
    }

    @Override
    public void getWhatsappStatus(Status[]statuses) {
        for (Status status : statuses) {
            System.out.println(status.name());
        }

    }
    @Override
    public String addContact() {
        System.out.print("Write your password: ");
        String password= sc.next();
        List<Profile>wh=new ArrayList<>();
        for (Profile profile : profileList) {
            for (Whatsapp whatsapp : profile.getWhatsappList()) {
                if (whatsapp.getPassword().equals(password) ){
                    String user1= profile.getUserName();
                    System.out.println(user1);// user1
                    wh.equals(password);
                    whatsapp.setContact(wh);}

                System.out.print("Write phone number:");
                String phoneNumber= sc.next();

                if (profile.getPhoneNumber().equals(phoneNumber)) {
                    String user2 = profile.getUserName();
                    System.out.println(user2);//user2
                    String phone = profile.getPhoneNumber();
                    String image = profile.getImage();
                    Status status = profile.getStatus();
                    Profile us = new Profile(phone, image, user2, status);
                    wh.add(us);
                    return "Contact " + profile.getUserName() + " added successfully!!!!!!!!!";
                }
            }

        }
        return "Not found phone number";
    }
}
