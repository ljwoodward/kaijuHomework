package codeclan.com.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by janemackay on 01/11/2017.
 */

public class KaijuTest {

    Godzilla godzilla;
    Mothra mothra;
    Jeep jeep1;

    @Before
    public void before() {
        godzilla = new Godzilla("Duncan", 100, 20);
        jeep1 = new Jeep("Land", 100);
        mothra = new Mothra("Margaret", 100, 18);
    }


    @Test
    public void canRoar() {
        assertEquals("Rooooooaaaaar!", godzilla.roar());
    }

    @Test
    public void canAttack() {
        godzilla.attack(jeep1);
        int result = jeep1.getHealthValue();
        assertEquals(80, result);
    }

    @Test
    public void godzillaCanMove() {
        assertEquals("Moving: See me scurry!", godzilla.move());
    }

    @Test
    public void mothraCanMove() {
        assertEquals("Moving: Buzzzzzzz!", mothra.move());
    }
}
