package com.example;

public abstract class Animal {    
    
    // fields set to private for encapsulation. 
    // stating "private" is required in this instance to denote this, as the default is public.
    private int id;
    private String breed;
    private int age;
    
    //Constructor
    public Animal(int inpId, String inpBreed, int inpAge) {
        this.id = inpId;
        this.breed = inpBreed;
        this.age = inpAge;
    }
    
    //methods
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }    

    // adding method to display animal information to reduce repeated code
    public void displayInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Breed: " + this.breed);
        System.out.println("Age: " + this.age);
    }
    
}
