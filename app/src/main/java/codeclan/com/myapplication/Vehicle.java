package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public abstract class Vehicle {

    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

}
