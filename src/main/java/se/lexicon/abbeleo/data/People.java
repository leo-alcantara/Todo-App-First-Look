package se.lexicon.abbeleo.data;

import se.lexicon.abbeleo.model.Person;

import java.util.Arrays;

public class People {

    private static final int PERSONID = 0;
    private static Person[] personArray = {};

    public int size() {
        return personArray.length;
    }

    public Person[] findAll() {
        personArray = Arrays.copyOf(personArray, personArray.length);
        return personArray;
    }

    public Person findById(int personId) {
        for (Person person:
             personArray) {
            if (PERSONID == personId) {
                return person;
            }
        }
       return null; //Needs to change
    }

    public Person createNewPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        personArray = Arrays.copyOf(personArray, personArray.length + 1);
        personArray[personArray.length - 1] = person;

        return person;

    }

    public void clear() {
        personArray = Arrays.copyOf(personArray, 0);
    }


}





