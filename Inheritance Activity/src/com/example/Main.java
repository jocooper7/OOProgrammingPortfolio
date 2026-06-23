package com.example;

public class Main {
   
    public static void main(String[] args) {

        // reference variables for Dog object
        int dogId = 1001;
        String dogBreed = "Corgi";
        int dogAge = 14;
        String dogAbility = "Roll Over";
        
        // creation of dog object with reference variables as arguments
        Dog myDog = new Dog(dogId, dogBreed, dogAge, dogAbility);

        // reference variables for Cat object
        int catId = 2001;
        String catBreed = "Exotic";
        int catAge = 10;
        String catAbility = "Shake";

        // creation of cat object with reference variables as arguments
        Cat yourCat = new Cat(catId, catBreed, catAge, catAbility);

        // display methods for object information including special ability fields
        System.out.println("Dog information:");
        myDog.displayInfo();

        System.out.println("Cat information:");
        yourCat.displayInfo();
    }
}
