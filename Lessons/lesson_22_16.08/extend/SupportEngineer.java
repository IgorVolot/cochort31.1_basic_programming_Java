package extend;

public class SupportEngineer extends Employee {

    public SupportEngineer(String name, int salary) {
        super(name, salary);
    }

    public String toString() {
        return "SupportEngineer" + super.getName() + " " + super.getSalary();
    }

    public void work() {
        System.out.println("I'm " + super.getName() + ". I'm a SupportEngineer. I contact with customers");
    }
}
