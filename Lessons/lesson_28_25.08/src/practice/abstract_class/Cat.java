package abstract_class;

public class Cat extends Pet{
    private String name;
    private String breed;
    private String color;

    public Cat(String kind, int age, double weigth, boolean gender, String name, String breed, String color) {
        super(kind, age, weigth, gender);
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("I want milk! ");
    }

    @Override
    public void go() {
        System.out.println("Better, I will sleep ");
    }

    @Override
    public void voice() {
        System.out.println("Miaw");
    }
}
