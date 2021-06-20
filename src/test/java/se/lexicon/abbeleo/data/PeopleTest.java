package se.lexicon.abbeleo.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.abbeleo.model.Person;

import static org.junit.Assert.*;


public class PeopleTest<assertEquals> {
    private People myPeople;
    String firstName = "John";
    String lastName = "Doe";

    @Before
    public void before() {
        myPeople = new People();
        myPeople.clear();
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
    public void findAllTest() {
        //Arrange
        Person newPerson;
        Person[] personArray;

        //Act
        myPeople.createNewPerson(firstName, lastName);
        personArray = myPeople.findAll();

        //Assert
        assertEquals(1, personArray.length);

    }

    @Test
    public void findByIdTest() {
        //Arrange
        Person newPerson;
        //Act
        newPerson = myPeople.findById(12);

        //Assert
        assertEquals(null, newPerson);

    }

    @Test
    public void findByIdReturn() {
        //Arrange
        Person newPerson;

        //Act
        newPerson = myPeople.createNewPerson(firstName, lastName);
        myPeople.findById(newPerson.getPersonId());

         //Assert
        assertEquals(newPerson, newPerson);
    }


    @Test
    public void createNewPersonTest() {
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
    public void clearTest() {
        //Arrange
        myPeople.createNewPerson(firstName, lastName);
        //Act
        myPeople.clear();
        //Assert
        assertEquals(0, myPeople.size());
    }

    @Test
    public void removeTest() {
        //Arrange
        Person newPerson = myPeople.createNewPerson(firstName, lastName);

        //Act
        myPeople.remove(newPerson);
        //myPeople.size();
        //Assert
        assertEquals(0, myPeople.size());
        //assertEquals();
    }

    @Test
    public void removeTestNewArray(){
        //Arrange

        //Act

        //Assert


    }
}