package learning.java.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import learning.java.demo.repositories.TodoRepository;
import learning.java.demo.entities.Todo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TodoController {

    // Property to hold Todo Repository
    public TodoRepository Todos;

    // Receive Todo Repository via Dependency Injection
    public TodoController(TodoRepository Todos){
        this.Todos = Todos;
    }

    // get request to /Todos
    @CrossOrigin // Enable CORS <-
    @GetMapping("/pack")
    public List<Todo> index(){
        return Todos.findAll();
    }

    // get request to /Todos/:id
    @CrossOrigin // Enable CORS <-
    @GetMapping("/pack/{id}")
    public Optional<Todo> show(@PathVariable Integer id){
        return Todos.findById(id);
    }

    @CrossOrigin // Enable CORS <-
    @PostMapping("/pack")
    public List<Todo> create(@RequestBody Todo newTodo){
        Todos.save(newTodo); // Create the New Todo
        return Todos.findAll();
    }

    @CrossOrigin
	@PutMapping("/pack/{id}")
	public List<Todo> update(@RequestBody Todo packlistData, @PathVariable Integer id) {
		packlistData.setId(id);
		Todos.save(packlistData);
		return Todos.findAll();
	}

    @CrossOrigin // Enable CORS <-
    @DeleteMapping("/pack/{id}")
    public List<Todo> destroy(@PathVariable Integer id){
        Todos.deleteById(id);
        return Todos.findAll();
    }
}
