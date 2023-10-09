/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Anh Tu
 */
public class Person {
    String Name;
     int Age;

    public String getName() {
        return Name;
    }

    
    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   

    public void setAge(int Age) {
        this.Age = Age;
    }

    public Person() {
    }

    public Person(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
     
}
