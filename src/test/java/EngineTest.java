import dealership.components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Turbo Engine");

    }

    @Test
    public void engineHasAName(){
        assertEquals("Turbo Engine", engine.getName());
    }
}