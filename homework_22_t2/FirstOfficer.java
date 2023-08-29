package homework_22_t2;

public class FirstOfficer extends CockpitCrew {
    public FirstOfficer(String name, String typeRating, int flightHoursPM) {
        super(name, typeRating, flightHoursPM);
    }

    @Override
    public String toString() {
        return "First officer " + super.getName() + " " + super.getTypeRating() + " " + super.getFlightHoursPM();
    }
    public void work(){
        System.out.println("I'm " + super.getName() + " I have " + super.getFlightHoursPM());
    }

    @Override
    public void wantToFly() {
        System.out.println("I'm ready to fly, I have " + super.getFlightHoursPM());
        limitsToFlight(80);
    }

    @Override
    public void giveMeRest() {
        System.out.println("Give me a rest on next weekend ");
        limitsToFlight(80);
    }
}
