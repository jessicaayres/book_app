/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jessica
 */
public class Store extends Location {
    String address;
    
    //constructor
    Store(String name, String address){
        super(name);
        this.address = address;
    }
    //methods
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void changeAddress(){
        
    }
}
