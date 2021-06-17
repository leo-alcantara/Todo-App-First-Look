package se.lexicon.abbeleo.data;

import se.lexicon.abbeleo.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static final int TODOID = 0;
    private static Todo[] todoArray = {};

    public int size() {
        return todoArray.length;
    }

    public Todo[] findAll() {
        todoArray = Arrays.copyOf(todoArray, todoArray.length);
        return todoArray;
    }

    public Todo findById(int todoId) {
        for (Todo todo:
                todoArray) {
            if (TODOID == todoId) {
                return todo;
            }
        }
        return null; //Needs to change
    }

    public Todo createNewPerson(int TODOID, String description) {
        Todo todo = new Todo(TODOID, description);
        todoArray = Arrays.copyOf(todoArray, todoArray.length + 1);
        todoArray[todoArray.length - 1] = todo;

        return todo;

    }

    public void clear() {
        todoArray = Arrays.copyOf(todoArray, 0);
    }










}
