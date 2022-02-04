
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Book {
    String title;
    ArrayList<Review> review;
    ArrayList<Location> location;
    Person author;
    
    //constructor
    Book (String title, Person author){
        this.title = title;
        this.author = author;
        review = new ArrayList<>();
        location = new ArrayList<>();
    }
    //methods
    public void addReview(Book review){
        review.addReview(review); 
    }
    public void deleteReview(Book review){
        review.deleteReview(review);
    }
    public void addLocation(Book location){
        location.addLocation(location);
    }
    public void deleteLocation(Book location){
        location.deleteLocation(location);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
