package comm.example.dao;

import comm.example.model.Todo;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("todoDAO")
public class TodoDAOImpl implements TodoDAO {
    private final EntityManager entityManager;

    @Autowired
    public TodoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Todo> getTodo() {
        Query query=entityManager.createQuery("from Todo");
        return query.getResultList();
    }

    @Override
    @Transactional
    public void addTodo(Todo todo) {
        Session session=entityManager.unwrap(org.hibernate.Session.class);
        session.saveOrUpdate(todo);
    }

    @Override
    @Transactional
    public Todo getTodo(int todoId) {

        return entityManager.find(Todo.class,todoId);
    }

    @Override
    @Transactional
    public void deleteTodo(int todoId) {
        entityManager.remove(getTodo(todoId));
    }
}
