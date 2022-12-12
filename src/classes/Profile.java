package classes;

import enums.Status;

import java.util.List;

public class Profile {

    private String phoneNumber;
    private String image="DEFAULT IMAGE";
    private String userName;
    private Status status;
    private List<Whatsapp>whatsappList;


    public Profile(String phoneNumber, String image, String userName, Status status, List<Whatsapp> whatsappList) {
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.userName = userName;
        this.status = status;
        this.whatsappList = whatsappList;
    }
    public Profile(String phoneNumber, String image, String userName, Status status) {
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.userName = userName;
        this.status = status;

    }

    public Profile(){}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status setStatus(Status status) {
        this.status = status;
        return status;
    }

    public List<Whatsapp> getWhatsappList() {
        return whatsappList;
    }

    public void setWhatsappList(List<Whatsapp> whatsappList) {
        this.whatsappList = whatsappList;
    }

    @Override
    public String toString() {
        return
                "\n             Whatsapp / Profile "+
                "\n             phoneNumber='" + phoneNumber +
                "\n             image='" + image +
                "\n             userName='" + userName +
                "\n             status=" + status +
                "\n             " + whatsappList;
    }
}
