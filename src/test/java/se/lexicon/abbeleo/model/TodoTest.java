package se.lexicon.abbeleo.model;

import org.junit.Test;
import se.lexicon.abbeleo.data.TodoSequencer;

import static org.junit.Assert.*;

public class TodoTest {

    @Test
    public void createTodo() {
        //Arrange
        int sequencer = 0;

        String expectedDescription = "Sort People";
        int expectedTODOID = ++sequencer;
        //Act

        Todo sortPeople = new Todo(expectedTODOID, expectedDescription);

        //Assert
        assertEquals(expectedTODOID, TodoSequencer.nextTodoId());
        assertEquals(expectedDescription, sortPeople.getDescription());

    }
}