package Animals;
import Mobility.Mobile;
import Olympics.Medal;

public abstract class Animal extends Mobile{
    private String name;
    private enum gender;
    private double weight,speed;
    private Medal[]medals;
    Point position;
    protected abstract String getSound();

    public Animal(String name, enum gender, double weight, double speed) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
    }
//    public void makeSound():type{
        String st = "Animal" + name + "said" + getSound();
//    }

    
}
