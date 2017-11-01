package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public class Jeep extends Vehicle {
    public Jeep(String type, int healthValue) {
        super(healthValue);
    }

    public int setHealthValue(int healthValue) {
        super.setHealthValue(healthValue);
        return healthValue;
    }
}
