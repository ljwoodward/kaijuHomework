package codeclan.com.myapplication;

/**
 * Created by janemackay on 01/11/2017.
 */

public class Mothra extends Kaiju {

    public Mothra(String name, int healthValue, int attackValue){
        super(name, healthValue ,attackValue);
    }

    public String roar(){
        return "Sqwaaaaaaaark!";
    }

}
