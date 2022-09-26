package learning.java.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    //**************************************** */
    //  Entity Properties
    //**************************************** */

    @Id //Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generates
    public Integer id;

    public String day;

    public String date;
  
    public String outfitOne;
  
    public String outfitTwo;
  
    public String outfitThree;
  
    public String type;
  
    public String items;
  
    public String image;

    //**************************************** */
    //  Constructors
    //**************************************** */

    public Todo(){

    }
    public Todo(String day, String date, String outfitOne, String outfitTwo, String outfitThree, String type, String items, String image){
        this.day = day;
        this.date = date;
        this.outfitOne = outfitOne;
        this.outfitTwo = outfitThree;
        this.outfitThree = outfitThree;
        this.type = type;
        this.items = items;
        this.image = image;
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
    
      public String getDay() {
        return this.day;
      }
    
      public void setDay(String day) {
        this.day = day;
      }
    
      public String getDate() {
        return this.date;
      }
    
      public void setDate(String date) {
        this.date = date;
      }
    
      public String getOutfitOne() {
        return this.outfitOne;
      }
    
      public void setOutfitOne(String outfitOne) {
        this.outfitOne = outfitOne;
      }
    
      public String getOutfitTwo() {
        return this.outfitTwo;
      }
    
      public void setOutfitTwo(String outfitTwo) {
        this.outfitTwo = outfitTwo;
      }
      
      public String getOutfitThree() {
        return this.outfitThree;
      }
    
      public void setOutfitThree (String outfitThree) {
        this.outfitThree = outfitThree;
      }
      public String getType() {
        return this.type;
      }
    
      public void setType (String type) {
        this.type = type;
      }
      public String getItems() {
        return this.items;
      }
    
      public void setItems (String items) {
        this.items = items;
      }
      public String getImage() {
        return this.image;
      }
    
      public void setImage (String image) {
        this.image = image;
      }
    }
