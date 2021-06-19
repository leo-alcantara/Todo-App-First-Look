package se.lexicon.abbeleo.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.abbeleo.data.People;
import se.lexicon.abbeleo.model.Person;

import static org.junit.Assert.*;


public class PeopleTest {
    private People myPeople;
    String firstName = "John";
    String lastName = "Doe";

    @Before
    public void before() {
        myPeople = new People();
        //myPeople.clear();

    }

    @Test
    public void sizeTest() {
        //Arrange
        int personArraySize;

        //Act
        personArraySize = myPeople.size();

        //Assert
        assertEquals(0, personArraySize);
    }

    @Test
    public void findAll() {
        //Arrange
        Person[] personArray;

        //Act
        personArray = myPeople.findAll();

        //Assert
        assertEquals(0, personArray.length);

    }

    @Test
    public void findById() {
        //Arrange
        Person newPerson;
        //Act
        newPerson = myPeople.findById(12);

        //Assert
        assertEquals(null, newPerson);

    }

    @Test
    public void createNewPerson() {
        //Arrange
        Person newPerson;

        //Act
        newPerson = myPeople.createNewPerson(firstName, lastName);

        //Assert
         assertEquals(firstName, newPerson.getFirstName());
         assertEquals(lastName, newPerson.getLastName());
         //assertEquals(1, myPeople.size());
    }

    @Test
    public void clear() {
        //Arrange
         myPeople.createNewPerson(firstName, lastName);
        //Act
         myPeople.clear();
        //Assert
        assertEquals(0, myPeople.size());
    }

    @Test
    public void remove() {
        //Arrange
          Person newPerson = myPeople.createNewPerson(firstName, lastName);

        //Act
          myPeople.remove(newPerson);

        //Assert
          assertEquals(0, myPeople.size());
    }
}