package se.lexicon.abbeleo.data;

public class PersonSequencer {

    private static int personId;

    public static int nextPersonId(){
        int sequencer = 0;
        personId = ++sequencer;
        return personId;
    }

    public static int reset(){
        personId = 0;
        return personId;
    }





}
