package Olympics;

public class Medal {
    // important: there might be a problem with the enum cuz the name is type
    public enum Type { bronze, silver, gold} //creating the enum type of the mwdal
    // important: public enum????

    private final Type type; // Type of the medal
    private final String tournament; // name of the tournament that
    private final int year; // Year that they won medal


    public Medal(Type type, String tournament, int year) {
        this.type = type;
        this.tournament = tournament;
        this.year = year;
    }
    // should we really get the type as an object? Or should it be a simple string?

    private Type getType() {
        return type;
    }
    // important: maybe retuning type will cause issue with encapsulation

    public String getTournament() {
        return tournament;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Medal:" +
                "\n\ttype is " + type +
                "\n\ttournament is " + tournament +
                "\n\tyear is " + year +
                "\n";
    }


}

/*

    private void setType(Type type) {
        this.type = type;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }
*/


