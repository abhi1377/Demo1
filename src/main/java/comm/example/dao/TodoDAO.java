package comm.example.dao;

import comm.example.model.Todo;

import java.util.List;

public interface TodoDAO {
    public List<Todo> getTodo();
    public void addTodo(Todo todo);
    public Todo getTodo(int todoId);
    public void deleteTodo(int todoId);
}
