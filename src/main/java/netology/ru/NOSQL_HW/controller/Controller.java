package netology.ru.NOSQL_HW.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import netology.ru.NOSQL_HW.repository.User;
import netology.ru.NOSQL_HW.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers(User user) {
        return service.getUsers();
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable String id) {
        return service.getUser(id);
    }

    @PostMapping
    public User addUser(@RequestBody @Valid User user) {
        return service.addUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody @Valid User user) {
        return service.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(String id) {
        service.deleteUser(id);
    }

}
