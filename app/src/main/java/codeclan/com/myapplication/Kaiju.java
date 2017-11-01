package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    abstract String roar();

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(Vehicle vehicle) {
        int health = vehicle.getHealthValue();
        int damage = health -= this.getAttackValue();
        vehicle.setHealthValue(damage);
    }
}
