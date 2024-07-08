package Animals;

import Mobility.Mobile;
import Olympics.Medal;
import Mobility.Point;

public class Animal extends Mobile{
    private String name;
    private enum gender;
    private double weight,speed;
this.name = new String(name);
    private Point position;

    public enum Gender {MALE, FEMALE}


    public Animal(String name, enum gender, double weight, double speed) {
        super(position);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.position = position;
        this.Medals = new Medal;
    }

    protected abstract String getSound();

    public void makeSound(){
        System.out.println("Animal " + name + " said " + getSound());
    }
    
}
