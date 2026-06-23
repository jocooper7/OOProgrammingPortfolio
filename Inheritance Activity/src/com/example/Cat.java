package com.example;

// the keyword "extends" denotes that the Cat class inherits from the Animal class.
public class Cat extends Animal {
    
    // fields set to private for encapsulation. 
    // stating "private" is required in this instance to denote this as the default is public.
    private String specialAbility;
    
    // Constructor for Cat class
    public Cat(int inpId, String inpBreed, int inpAge,String inpSpecialAbility) {
        super(inpId, inpBreed, inpAge);
        this.specialAbility = inpSpecialAbility;
    }    

    // methods for Special Ability Field
    public String getSpecialAbility() {
        return this.specialAbility;
    }

    public void setSpecialAbility(String inpSpecialAbility) {
        this.specialAbility = inpSpecialAbility;
    }

    // added method to print information to reduce repeated code
    // super.display() calls on the parent class's print for the initial fields
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Special Ability: " + this.specialAbility);
        System.out.println("");
    }
}
