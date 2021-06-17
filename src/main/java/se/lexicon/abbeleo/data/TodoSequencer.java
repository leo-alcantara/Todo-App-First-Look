package se.lexicon.abbeleo.data;

public class TodoSequencer {

    private static int todoId;

    public static int nextTodoId() {
        int sequencer = 0;
        todoId = ++sequencer;
        return todoId;

    }

       public static int reset() {
           todoId = 0;
           return todoId;
       }


}
