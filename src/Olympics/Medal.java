package Olympics;

public class Medal {
    // Defining the enum Type of the medal
    public enum Type { bronze, silver, gold } // public enum to allow access from outside the class

    private final Type type; // Type of the medal
    private final String tournament; // Name of the tournament
    private final int year; // Year the medal was won

    // Constructor to initialize the fields
    public Medal(Type type, String tournament, int year) {
        this.type = type;
        this.tournament = tournament;
        this.year = year;
    }

    // Getter method for type
    public Type getType() {
        return type;
    }

    // Getter method for tournament
    public String getTournament() {
        return tournament;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Overriding toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Medal:" +
                "\n\ttype is " + type +
                "\n\ttournament is " + tournament +
                "\n\tyear is " + year +
                "\n";
    }
}
