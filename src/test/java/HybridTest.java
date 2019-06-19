import dealership.car.Hybrid;
import dealership.components.Engine;
import dealership.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {
    Hybrid hybrid;
    Engine engine;
    Tyres tyres;


    @Before
    public void before(){
        engine = new Engine("Turbo Engine");
        tyres = new Tyres("Michelin");
        hybrid = new Hybrid(12000.00, "Blue", engine, tyres);
    }

    @Test
    public void hybridHasAPrice(){
        assertEquals(12000.00, hybrid.getPrice(), 0.01);
    }

    @Test
    public void hybridHasAColour(){
        assertEquals("Blue", hybrid.getColour());
    }

    @Test
    public void checkIfCarHasAEngine(){
        assertEquals(engine, hybrid.getEngine());
    }

    @Test
    public void checkIfCarHasATyre(){
        assertEquals(tyres, hybrid.getTyres());
    }


}
