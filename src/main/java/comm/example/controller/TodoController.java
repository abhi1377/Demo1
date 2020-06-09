package comm.example.controller;

import comm.example.model.Todo;
import comm.example.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/listTodo")
    public String listTodo(Model model)
    {
        model.addAttribute("todos",todoService.getTodo());
        return "list-todo";
    }
    @RequestMapping("/add-todo")
    public String addTodo(Model model)
    {
        model.addAttribute("todo",new Todo());
        return "todo-form";
    }
    @RequestMapping("/saveTodo")
    public String saveCustomer(@ModelAttribute("todo") Todo todo)
    {
        todoService.addTodo(todo);
        return "redirect:/todo/listTodo";
    }
    @RequestMapping("/updateTodo")
    public String updateTodo(@ModelAttribute("todo") Todo todo)
    {
        todoService.getTodo(todo.getId());
        return "todo-form";
    }
    @RequestMapping("/delete")
    public String deleteTodo(@ModelAttribute("todo") Todo todo)
    {
        todoService.deleteTodo(todo.getId());
        return "list-todo";
    }
}
