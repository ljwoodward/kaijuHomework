package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public abstract class Kaiju {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    abstract String roar();
}
