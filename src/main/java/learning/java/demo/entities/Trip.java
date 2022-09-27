package learning.java.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {

    //**************************************** */
    //  Entity Properties
    //**************************************** */

    @Id //Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generates
    public Integer id;

    public String trip;

    public String days;

    public String dates;

    //**************************************** */
    //  Constructors
    //**************************************** */

    public Trip(){

    }
    public Trip(String trip, String days, String dates){
        this.trip = trip;
        this.days = days;
        this.dates = dates;
    }

    //**************************************** */
    //  GETTERS AND SETTERS
    //**************************************** */
    public Integer getId() {
        return this.id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
      public String getTrip() {
        return this.trip;
      }
    
      public void setTrip (String trip) {
        this.trip = trip;
      }
    
      public String getDays() {
        return this.days;
      }
    
      public void setDays(String days) {
        this.days = days;
      }
    
      public String getDates() {
        return this.dates;
      }
    
      public void setDates(String dates) {
        this.dates = dates;
      }
    }
