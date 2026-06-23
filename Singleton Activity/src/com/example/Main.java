package com.example;

public class Main {
   
    public static void main(String[] args) {
       
        Model101 model101 = new Model101();
        T1000 t1000 = new T1000();
        
        model101.updateCore(500);
        t1000.updateCore(1000);        
        
        System.out.println("Centralized cores: " + ModelStorage.getInstance().getCores());
        
    }
    
}
