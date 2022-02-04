
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Review {
    Person person;
    Book book;
    ArrayList<Review> review;
    ArrayList<Club> club;
    
    //constructor
    Review (Person person, Book book){
        this.person = person;
        this.book = book;
        review = new ArrayList<>();
        club = new ArrayList<>();
    }
    //methods
    public void editReview(){
        
    }
    public void addClub(Review club){
        club.addClub(club);
    }
    public void removeClub(Review club){
        club.removeClub(club);
    }
}
