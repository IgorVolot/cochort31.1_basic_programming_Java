package ait;

public class CockpitCrew {
    private String name;
    private String typeRating;
    private int flightHoursPM;

    public CockpitCrew(String name, String typeRating, int flightHoursPM) {
        this.name = name;
        this.typeRating = typeRating;
        this.flightHoursPM = flightHoursPM;
    }

    @Override
    public String toString() {
        return "CockpitCrew: " + "name= " + name + " - " + " typeRating- " + typeRating + ", " + " flightHoursPM= " + flightHoursPM + "hrs";
    }

    public String getName() {
        return name;
    }

    public String getTypeRating() {
        return typeRating;
    }

    public int getFlightHoursPM() {
        return flightHoursPM;
    }

    public void work() {
    }

    public void wantToFly() {
    }

    public void giveMeRest() {
    }

    public void limitsToFlight(int flightHoursPM) {
        if (flightHoursPM < 80) {
            System.out.println("You're in schedule. You have only " + flightHoursPM);
        } else {
            System.out.println("Get the rest body!");
        }

    }
}
