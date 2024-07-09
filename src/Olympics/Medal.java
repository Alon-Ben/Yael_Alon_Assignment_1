package Olympics;

/**
 * Represents an Olympic medal with its type, tournament, and year.
 */
public class Medal {
    /**
     * Enum representing the types of medals available.
     */
    public enum Type { bronze, silver, gold } // public enum to allow access from outside the class

    /** The type of the medal. */
    private final Type type; // Type of the medal (bronze, silver, or gold)

    /** The name of the tournament where the medal was won. */
    private final String tournament; // Name of the tournament (e.g., "Summer Olympics")

    /** The year the medal was won. */
    private final int year; // Year the medal was won (e.g., 2024)

    /**
     * Constructs a new Medal with the specified type, tournament, and year.
     *
     * @param type The type of the medal (bronze, silver, or gold).
     * @param tournament The name of the tournament where the medal was won.
     * @param year The year the medal was won.
     */
    public Medal(Type type, String tournament, int year) {
        // Initialize all fields with the provided values
        this.type = type;
        this.tournament = tournament;
        this.year = year;
    }

    /**
     * Gets the type of the medal.
     *
     * @return The type of the medal.
     */
    public Type getType() {
        return type; // Return the medal type
    }

    /**
     * Gets the name of the tournament where the medal was won.
     *
     * @return The name of the tournament.
     */
    public String getTournament() {
        return tournament; // Return the tournament name
    }

    /**
     * Gets the year the medal was won.
     *
     * @return The year of the medal.
     */
    public int getYear() {
        return year; // Return the year
    }

    /**
     * Returns a string representation of the Medal object.
     *
     * @return A string containing the medal's type, tournament, and year.
     */
    @Override
    public String toString() {
        // Construct and return a formatted string representation of the medal
        return "Medal:" +
                "\n\ttype is " + type +
                "\n\ttournament is " + tournament +
                "\n\tyear is " + year +
                "\n";
    }
}