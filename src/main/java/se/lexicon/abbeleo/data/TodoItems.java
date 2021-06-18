package se.lexicon.abbeleo.data;

import se.lexicon.abbeleo.model.Person;
import se.lexicon.abbeleo.model.Todo;

import java.util.Arrays;

public class TodoItems {

    //private static final int TODOID = 0;
    //private boolean done;
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
            if (todo.getTodoId() == todoId) {
                return todo;
            }
        }
        return null;
    }

    public Todo createNewTodo(int TODOID, String description) {
        Todo todo = new Todo(TODOID, description);
        todoArray = Arrays.copyOf(todoArray, todoArray.length + 1);
        todoArray[todoArray.length - 1] = todo;

        return todo;
    }

    public void clear() {
        todoArray = Arrays.copyOf(todoArray, 0);
    }

    public Todo[] findByDoneStatus(boolean doneStatus) {
        Todo[] doneTodos = new Todo[0];
        for (Todo todo : todoArray) {
            if (todo.isDone() == doneStatus) {
                doneTodos = Arrays.copyOf(doneTodos, doneTodos.length + 1);
                doneTodos[doneTodos.length - 1] = todo;
            } else {
                break;
            }
        }
        return doneTodos;
    }

    public Todo[] findByAssignee(int personId){
        Todo[] assigneeIdMatches = new Todo[0];
        for (Todo todo : todoArray) {
            if (todo.getAssignee().getPersonId() == personId) {
                assigneeIdMatches = Arrays.copyOf(assigneeIdMatches, assigneeIdMatches.length + 1);
                assigneeIdMatches[assigneeIdMatches.length - 1] = todo;
            } else {
                break;
            }
        }

        return assigneeIdMatches;
    }

    public Todo[] findByAssignee(Person assignee){
        Person[] assigneeMatches = new Person[0];
        for (Todo todo : todoArray) {
            if (todo.getAssignee() == assignee) {
                assigneeMatches = Arrays.copyOf(assigneeMatches, assigneeMatches.length + 1);
                assigneeMatches[assigneeMatches.length - 1] = assignee;
            } else {
                break;
            }
        }
        return null;
    }

    public Todo[] findUnassignedTodoItems() {
        Todo[] unassignedTodo = new Todo[0];
        for (Todo todo : todoArray) {
            if (todo.getAssignee().equals(null) ) {
                unassignedTodo = Arrays.copyOf(unassignedTodo, unassignedTodo.length + 1);
                unassignedTodo[unassignedTodo.length - 1] = todo;
            }
        }
        return null;
    }

    public static boolean remove (Todo todoName) {
        for (int i = 0; i < todoArray.length; i++) {
            if (!todoArray[i].equals(todoName)) {
                todoArray = Arrays.copyOf(todoArray, todoArray.length - 1);
                todoArray[i] = todoArray[todoArray.length - 1];

                break;
            }
        }
        return true;
    }







}
