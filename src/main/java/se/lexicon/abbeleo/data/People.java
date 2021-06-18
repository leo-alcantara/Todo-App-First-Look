package se.lexicon.abbeleo.data;

import se.lexicon.abbeleo.model.Person;
import se.lexicon.abbeleo.model.Todo;

import java.util.Arrays;

public class People {

    private static Person[] personArray = {};

    public int size() {
        return personArray.length;
    }

    public Person[] findAll() {
        personArray = Arrays.copyOf(personArray, personArray.length);
        return personArray;
    }

    public Person findById(int personId) {
        for (Person p:
             personArray) {
            if (p.getPersonId() == personId) {
                return p;
            }
        }
       return null;
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

    public static boolean remove (Person personName) {
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].equals(personName)) {
                personArray[i] = personArray[personArray.length - 1];
                personArray = Arrays.copyOf(personArray, personArray.length - 1);
                break;
            }
        }
        return true;
    }

    public static int getSize(Person[] arrayName) {

        return arrayName.length;
    }

}





