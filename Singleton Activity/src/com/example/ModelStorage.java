package com.example;

public class ModelStorage {
    
    private ModelStorage(){
    }
    
    private int core = 0;
      
    private static final ModelStorage instance = new ModelStorage();
    
    public static ModelStorage getInstance(){
        return instance;
    }    
      
    public void addCore(int core){
        this.core += core;
    }
    
     public int getCores(){
        return this.core;
    }
}
