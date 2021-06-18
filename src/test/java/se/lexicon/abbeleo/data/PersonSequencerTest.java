package se.lexicon.abbeleo.data;

import org.junit.Test;
import se.lexicon.abbeleo.model.Person;

import static org.junit.Assert.*;

public class PersonSequencerTest {

    @Test
    public void nextPersonId() {

        //Arrange
        int nextPerson;

        //Act
        nextPerson= PersonSequencer.nextPersonId();

        //Assert
        assertEquals(+ 1, nextPerson);
    }

    @Test
    public void reset() {

        //Arrange
        int personId = 20;
        //int sequencer = 0;
        //Act
        personId = PersonSequencer.reset();
        //Assert
        assertEquals(0, personId);
    }
}