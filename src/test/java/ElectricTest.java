import dealership.car.Electric;
import dealership.components.Engine;
import dealership.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    Electric electric;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Turbo Engine");
        tyres = new Tyres("Michelin");


        electric = new Electric(5000.00, "Red", engine, tyres);
    }

    @Test
    public void checkIfCarHasPrice(){
        assertEquals(5000.00, electric.getPrice(), 0.01);
    }

    @Test
    public void checkIfCarHasAColour(){
        assertEquals("Red", electric.getColour());
    }

    @Test
    public void checkIfCarHasAEngine(){
        assertEquals(engine, electric.getEngine());
    }

    @Test
    public void checkIfCarHasATyre(){
        assertEquals(tyres, electric.getTyres());
    }
}
