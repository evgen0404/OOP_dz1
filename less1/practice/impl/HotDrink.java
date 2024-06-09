package less1.practice.impl;

import less1.practice.Product;

public class HotDrink extends Product {
  


    public HotDrink(String name, float volume, Integer temperature){
        super(name,volume,temperature); 
    
    }

    @Override
    public String toString() {
        return  "HotDrink{" +
        "name= '" + name + '\'' +
        "volume= " + volume +
        ", temperature= '" + temperature + '\'' +
        '}';
    }
        
}

