package dealership.car;

import dealership.components.Engine;
import dealership.components.Tyres;

public abstract class Car {
    Double price;
    String colour;
    Engine engine;
    Tyres tyres;

    public Car(Double price, String colour, Engine engine, Tyres tyres){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Tyres getTyres(){
        return this.tyres;
    }




}
