package se.lexicon.abbeleo.model;

public class Person {


    public String firstName;
    public String lastName;
    private final int PERSONID = 0;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() {
        return PERSONID;
    }

    /*public void setPersonId(int personId) {
        this.PERSONID = personId;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
