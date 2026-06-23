package com.example;

public class Model101 {

    // creates reference variable to ModelStorage singleton
    ModelStorage modelStorage = ModelStorage.getInstance();
    
    public void updateCore(int core){
         modelStorage.addCore(core);      
    }
    
}
