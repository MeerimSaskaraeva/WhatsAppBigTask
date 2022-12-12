package classes;

import enums.City;
import enums.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Passport {
    private  long id;
    private List<Person> personSet;



    public Passport(long id,List<Person> personSet) throws Exception{
        setRightID(id);
        this.personSet = personSet;

    }

    public Passport() {

    }




    public List<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(List<Person> personSet) {
        this.personSet = personSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        setRightID(id);
    }

    private void setRightID(long id){
        if (id==getId()){
            System.out.println("Wrong ID: ");
        }else if (id!=getId()){
            this.id=id;
        }
    }

    @Override
    public String toString() {
        return  "\n                 ID: " + id +
                "\n                 Person: " + personSet;
    }
}

