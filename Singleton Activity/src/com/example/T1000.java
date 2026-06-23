
package com.example;

public class T1000 {    
    
    // creates reference variable to ModelStorage singleton
    ModelStorage modelStorage =  ModelStorage.getInstance();  
    
    public void updateCore(int core){
        modelStorage.addCore(core);
    }
    
}
