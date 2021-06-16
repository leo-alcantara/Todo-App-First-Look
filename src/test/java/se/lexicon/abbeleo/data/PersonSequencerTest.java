package se.lexicon.abbeleo.data;

import org.junit.Test;
import se.lexicon.abbeleo.model.Person;

import static org.junit.Assert.*;

public class PersonSequencerTest {

    @Test
    public void nextPersonId() {

        //Arrange
        int sequencer = 0;
        int sequencerIncremented = ++sequencer;
        int nextPersonId;

        //Act
        nextPersonId = sequencerIncremented;

        //Assert
        assertEquals(nextPersonId, sequencerIncremented);
    }

    @Test
    public void reset() {

        //Arrange
        int personId;
        int sequencer = 0;
        //Act
        personId = sequencer;
        //Assert
        assertEquals(personId, sequencer);
    }
}