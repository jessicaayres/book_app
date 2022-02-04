/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Site extends Location {
    String url;
    
    //constructor
    Site(String name, String url){
        super(name);
        this.url = url;
    }
    //methods
    public String getURL(){
        return this.url;
    }
    public void setURL(String url){
        this.url = url;
    }
    public void changeURL(){
        
    }
}
