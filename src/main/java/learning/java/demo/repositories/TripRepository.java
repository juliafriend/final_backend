  
package learning.java.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.demo.entities.Trip;

// Our Repository, the two types in <> are the Entity and type of the ID
public interface TripRepository extends JpaRepository<Trip, Integer>{

}