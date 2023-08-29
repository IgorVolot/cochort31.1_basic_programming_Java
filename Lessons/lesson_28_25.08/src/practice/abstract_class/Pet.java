package abstract_class;

import java.util.Objects;

public abstract class Pet {

    // поля класса
    private String kind; // вид животного
    private int age; // возраст
    private double weigth; // вес
    private boolean gender; // пол

    // конструктор

    public Pet(String kind, int age, double weigth, boolean gender) {
        this.kind = kind;
        this.age = age;
        this.weigth = weigth;
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "kind='" + kind + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        if (Double.compare(weigth, pet.weigth) != 0) return false;
        if (gender != pet.gender) return false;
        return kind.equals(pet.kind);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = kind.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weigth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (gender ? 1 : 0);
        return result;
    }

    // methods Pet class, тело метода должно отсутствовать

    public abstract void eat ();
    public abstract void go ();
    public abstract void voice ();



}
