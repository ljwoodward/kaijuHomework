package codeclan.com.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by janemackay on 01/11/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before() {
        godzilla = new Godzilla("Duncan", 100, 20);
    }

    @Test
    public void canRoar() {
        assertEquals("Rooooooaaaaar!", godzilla.roar());
    }
}
