
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Person {
    String name;
    int id;
    ArrayList<Review> review;
    
    //constructors
    Person (String name, int id){
        this.name = name;
        this.id = id;
        review = new ArrayList<>();
    }
    //methods
    public void addReview(Person review){
        review.addReview(review); 
    }
    public void deleteReview(Person review){
        review.deleteReview(review);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getID (){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public void changeName(){
       //dont know what to put here
       System.out.println(name);
    }
    
}
