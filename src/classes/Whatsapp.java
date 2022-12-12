package classes;

import java.util.List;

public class Whatsapp {
    private List<Profile> contact;
    private List<String> message;
    private String password;

    public Whatsapp(List<Profile> contact, List<String> message, String password) {
        this.contact = contact;
        this.message = message;
        this.password = password;
    }


    public Whatsapp() {

    }



    public List<Profile> getContact() {
        return contact;
    }

    public void setContact(List<Profile> contact) {
        this.contact = contact;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "- - - - - - - - - - - - - - - - - - - " +
                "\n             contacts=" + contact +
                "\n             message=" + message +
                "\n             password=" + password+
                """
               \nooooooooooooooooooooooooooooooooooooooooooooooooooooo""";
    }
}
