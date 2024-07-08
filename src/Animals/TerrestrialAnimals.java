package animals;

import mobility.Point;

public abstract class TerrestrialAnimal extends Animal {
    private int noLegs;

    public TerrestrialAnimal(String name, Gender gender, double weight, double speed, int noLegs) {
        super(name, gender, weight, speed, new Point(0, 20));
        this.noLegs = noLegs;
    }

    public int getNoLegs() {
        return noLegs;
    }

    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TerrestrialAnimal that = (TerrestrialAnimal) o;
        return noLegs == that.noLegs;
    }



    @Override
    public String toString() {
        return "TerrestrialAnimal{" +
                "noLegs=" + noLegs +
                "} " + super.toString();
    }
}