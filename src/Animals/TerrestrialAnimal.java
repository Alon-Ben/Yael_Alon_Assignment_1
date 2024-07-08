package animals;

import mobility.Point;

public abstract class TerrestrialAnimals extends Animal {
    private int noLegs;

    public TerrestrialAnimals(String name, Gender gender, double weight, double speed, Point position, int noLegs) {
        super(name, gender, weight, speed, position);
        this.noLegs = noLegs;


        public String toString() {
            return "TerrestrialAnimals{" +
                    "name='" + getName() + '\'' +
                    ", gender=" + getGender() +
                    ", weight=" + getWeight() +
                    ", speed=" + getSpeed() +
                    ", position=" + getPosition() +
                    ", noLegs=" + noLegs +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            TerrestrialAnimals that = (TerrestrialAnimals) o;

            return noLegs == that.noLegs;
        }

    }

