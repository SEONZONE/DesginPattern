package FactoryPattern.PizzaStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.printf("Preparing "+dough);
        System.out.printf("Preparing "+sauce);
        for(String topping:toppings){
            System.out.printf("Preparing "+topping);
        }
    }

    void bake(){
        System.out.println("Baking "+name);
    }

    void cut(){
        System.out.println("Cutting "+name);
    }

    void box(){
        System.out.println("Boxing "+name);
    }

    public String getName() {
        return name;
    }
}
