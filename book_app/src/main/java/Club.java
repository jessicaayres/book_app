
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Club {
    Book book;
    ArrayList<Person> members;
    
    //constructors
    Club (Book book){
        this.book = book;
        members = new ArrayList<>();
    }
    //methods
    public void joinClub(Club person){
        person.joinClub(person);
    }
    public void leaveClub(Club person){
        person.leaveClub(person);
    }
 
}
