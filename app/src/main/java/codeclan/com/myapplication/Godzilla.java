package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue ,attackValue);
    }

    public String roar(){
        return "Rooooooaaaaar!";
    }

    public void attack(Vehicle vehicle){
        super.attack(vehicle);
    }

    public String move() {
        return super.move() + "See me scurry!";
    }
}
