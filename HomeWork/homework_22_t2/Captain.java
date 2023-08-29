package homework_22_t2;

public class Captain extends CockpitCrew {

    public Captain(String name, String typeRating, int flightHoursPM) {
        super(name, typeRating, flightHoursPM);
    }

    @Override
    public String toString() {
        return "Captain " + super.getName() + " " + super.getTypeRating() + " " + super.getFlightHoursPM();
    }
    public void work(){
        System.out.println("I'm " + super.getName() + " I have " + super.getFlightHoursPM());
    }

    @Override
    public void wantToFly() {
        System.out.println("I'm ready to fly, I have " + super.getFlightHoursPM());

    }

    @Override
    public void giveMeRest() {
        System.out.println("Give me the rest on next weekend, I have "+ super.getFlightHoursPM());

    }
}
