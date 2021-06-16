package se.lexicon.abbeleo.data;

public class PersonSequencer {

    private static int personId;

    static int nextPersonId(){
        int sequencer = 0;
        personId = ++sequencer;
        return personId;
    }

    static int reset(){
        personId = 0;
        return personId;
    }





}
