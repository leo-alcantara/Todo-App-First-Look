package se.lexicon.abbeleo.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class TodoSequencerTest {

    @Test
    public void nextTodoId() {

        //Arrange
        int todoId;
        int sequencer = 0;
        //Act
        todoId = sequencer;
        //Assert
        assertEquals(todoId, sequencer);

    }

    @Test
    public void reset() {

        //Arrange
        int todoId = 20;
        //int sequencer = 0;
        //Act
        //todoId = 0;
        //Assert
        assertEquals(0, TodoSequencer.reset());

    }
}