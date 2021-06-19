package se.lexicon.abbeleo.model;

import se.lexicon.abbeleo.data.TodoSequencer;

public class Todo {

    private final int TODOID;
    private String description;
    private boolean done;
    private Person assignee;



    public Todo(int todoId, String description){

        this.TODOID = todoId;
        this.description = description; //Need to review
    }



    public int getTodoId() {
        return TODOID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }





}
