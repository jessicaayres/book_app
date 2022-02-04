
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
abstract class Location {
    String name;
    ArrayList<Book> book;
    
    //constructor
    Location (String name){
        this.name = name;
        book = new ArrayList<>();
    }
    //methods
    //need help w these
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void addBook (Location book){
        book.addBook(book);
    }
    public void removeBook (Location book){
        book.removeBook(book);
    }
    
}
