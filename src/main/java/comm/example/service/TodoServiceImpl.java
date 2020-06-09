package comm.example.service;

import comm.example.dao.TodoDAO;
import comm.example.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("todoService")
public class TodoServiceImpl implements TodoService {
    private TodoDAO todoDAO;

    public TodoServiceImpl() {
    }

    @Autowired
    public TodoServiceImpl(TodoDAO todoDAO) {
        this.todoDAO = todoDAO;
    }

    @Override
    public List<Todo> getTodo() {
        return todoDAO.getTodo();
    }

    @Override
    public void addTodo(Todo todo) {
        todoDAO.addTodo(todo);

    }

    @Override
    public Todo getTodo(int todoId) {
        return todoDAO.getTodo(todoId);
    }

    @Override
    public void deleteTodo(int todoId) {
        todoDAO.deleteTodo(todoId);
    }
}
