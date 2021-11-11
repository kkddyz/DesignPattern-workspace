package headfirst_design_pattern.FactoryPattern.abstractFactory.pizza;


import headfirst_design_pattern.FactoryPattern.abstractFactory.ingredient.*;

import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Chess chess;
    Pepperoni pepperoni;
    Clams clam;

    /**
     *  准备pizza所需的原料
     */
    public abstract void prepare();

    public void bake(){
        // 烘培25min
        System.out.println("Bake for  25 minutes at 350");
    }

    public void cut(){
        // 对角切碎
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        // 装盒打包
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", chess=" + chess +
                ", pepperoni=" + pepperoni +
                ", clams=" + clam +
                '}';
    }
}
