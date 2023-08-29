package HW_17_Cars;

public class Persone {
    private String name;
    private int age;

    public Persone(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name +" "+age;
    }
    public int getAge (){
        return age;
    }

    public void setAge(int age){
        if (age<0){
            return;
        }
        this.age=age;
    }
}
