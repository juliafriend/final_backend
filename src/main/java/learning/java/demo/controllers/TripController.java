package learning.java.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import learning.java.demo.repositories.TripRepository;
import learning.java.demo.entities.Trip;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TripController {

    // Property to hold Todo Repository
    public TripRepository Trips;

    // Receive Todo Repository via Dependency Injection
    public TripController(TripRepository Trips){
        this.Trips = Trips;
    }

    // get request to /Todos
    @CrossOrigin // Enable CORS <-
    @GetMapping("/trip")
    public List<Trip> index(){
        return Trips.findAll();
    }

    // get request to /Todos/:id
    @CrossOrigin // Enable CORS <-
    @GetMapping("/trip/{id}")
    public Optional<Trip> show(@PathVariable Integer id){
        return Trips.findById(id);
    }

    @CrossOrigin // Enable CORS <-
    @PostMapping("/trip")
    public List<Trip> create(@RequestBody Trip newTrip){
        Trips.save(newTrip); // Create the New
        return Trips.findAll();
    }

    @CrossOrigin
	@PutMapping("/trip/{id}")
	public List<Trip> update(@RequestBody Trip Data, @PathVariable Integer id) {
		Data.setId(id);
		Trips.save(Data);
		return Trips.findAll();
	}

    @CrossOrigin // Enable CORS <-
    @DeleteMapping("/trip/{id}")
    public List<Trip> destroy(@PathVariable Integer id){
        Trips.deleteById(id);
        return Trips.findAll();
    }
}
