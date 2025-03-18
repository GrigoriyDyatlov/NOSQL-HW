package netology.ru.NOSQL_HW.service;

import netology.ru.NOSQL_HW.repository.Repository;
import netology.ru.NOSQL_HW.repository.User;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUser(String id) {
        return repository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
