package bus_17;

import java.util.Arrays;

public class Passenger {
    private final int id;
    private String name;
    private String gender;
    private boolean isKind; // false
    static private int counter;

    public Passenger(String name, String gender) {
        this.id = counter++;
        this.name = name;
        this.gender = gender;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }
    public String toString() {
        return "{id:" + id + "; name:" + name + "}";
    }

    public static int getCounter() {
        return counter;
    }


}
