import classes.Passport;
import classes.Person;
import classes.Profile;
import classes.Whatsapp;
import enums.City;
import enums.Gender;
import enums.Status;
import service.impl.PersonImpl;
import service.impl.WhatsappImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PersonImpl person=new PersonImpl();
        WhatsappImpl whatsapp=new WhatsappImpl();
        Passport pass=new Passport();
        Person p1=new Person();
        Profile prof=new Profile();






        while (true){
            System.out.println("=========================== COMMANDS ==========================" +
                    "\n1 create passport " +
                    "\n2 get all passport " +
                    "\n3 get passport by first name" +
                    "\n4 get all city" +
                    "\n5 get whatsapp status" +
                    "\n6 install whatsapp" +
                    "\n7 change status" +
                    "\n8 get all whatsapp profile" +
                    "\n9 add contact" );
            System.out.print("\nWrite command: ");
            int press= sc.nextInt();
            switch (press) {
                case 1 -> {

                    System.out.println("Fill out a form! ");
                    System.out.print("Write ID: ");

                    long id = sc.nextLong();

                    System.out.print("Write Last name: ");
                    String lastName = sc.next().toUpperCase();

                    System.out.print("Write First name: ");
                    String firstName = sc.next().toUpperCase();

                    System.out.print("Write date of birth (yyyy mm dd): ");

                    int yyyy = sc.nextInt(), mm = sc.nextInt(), dd = sc.nextInt();
                    System.out.print("Write place of birth: ");
                    City place = City.valueOf(sc.next().toUpperCase());

                    System.out.print("Write your gender: ");
                    Gender gender = Gender.valueOf(sc.next().toUpperCase());


                    Person p=new Person( lastName, firstName,LocalDate.of(yyyy, mm, dd), place, gender);
                    List <Person>persons = new ArrayList<>();
                    persons.add(p);


                    Passport passport = new Passport(id,persons);
                    List<Passport> passportList = new ArrayList<>();
                    passportList.add(passport);

                    System.out.println(person.createPassport(passportList));

                }
                case 2-> person.getAllPassport().forEach(System.out::println);
                case 3-> {
                    System.out.print("Write first name: ");
                    System.out.println(person.getPassportByFirstNane(sc.next().toUpperCase()));}
                case 4-> person.getAllCity(City.values());
                case 5-> whatsapp.getWhatsappStatus(Status.values());
                case 6->{

                    Profile p2=new Profile();
                    System.out.print("Write your passport ID: ");
                    long id = sc.nextLong();


                    System.out.print("Write phone number: ");
                    String phone= sc.next();
                    String image=p2.getImage();
                    System.out.print("Write userName:");
                    String user= sc.next().toUpperCase();
                    Status status = Status.Hey_there_Im_using_Whatsapp;

                    System.out.print("Write password: ");
                    String password= sc.next().toUpperCase();
                    List<Profile> contact=new ArrayList<>();
                    List<String> message=new ArrayList<>();
                    Whatsapp what=new Whatsapp(contact,message,password);
                    List<Whatsapp>wh=new ArrayList<>();
                    wh.add(what);
                    Profile pr=new Profile(phone,image,user,status,wh);
                    List<Profile>profileList=new ArrayList<>();
                    profileList.add(pr);
                    System.out.println(whatsapp.installWhatsapp(id, profileList, person.getAllPassport(), wh));
                }
                case 7-> {
                    System.out.print("Write password: ");
                    String password2= sc.next().toUpperCase();
                    System.out.print("Write new status: ");
                    Status status=Status.valueOf(sc.next());
                    System.out.println(whatsapp.changeStatus(password2, status));}
                case 8-> whatsapp.getAllWhatsapp().forEach(System.out::println);
                case 9-> {

                    System.out.println(whatsapp.addContact());}

            }}}
}