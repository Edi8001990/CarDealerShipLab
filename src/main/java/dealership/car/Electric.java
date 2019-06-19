package dealership.car;

import dealership.components.Engine;
import dealership.components.Tyres;

public class Electric extends Car {
    public Electric(double price, String colour, Engine engine, Tyres tyres){
        super(price, colour, engine, tyres);
    }
}
