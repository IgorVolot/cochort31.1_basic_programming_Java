package abstract_class;

public class Dog extends Pet{
    private String name;
    private String breed;


    public Dog(String kind, int age, double weigth, boolean gender, String name, String breed) {
        super(kind, age, weigth, gender);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Give me more meat! ");
    }

    @Override
    public void go() {
        System.out.println("I'm walking away");
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
