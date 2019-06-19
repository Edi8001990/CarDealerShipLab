import dealership.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Michelin");
    }

    @Test
    public void tyresHasAName(){
        assertEquals("Michelin", tyres.getName());
    }
}
