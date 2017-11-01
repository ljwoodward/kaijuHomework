package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public abstract class Vehicle {

    private String type;
    private int healthValue;

    public Vehicle(int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int setHealthValue(int healthValue) {
        this.healthValue = healthValue;
        return healthValue;
    }
}
