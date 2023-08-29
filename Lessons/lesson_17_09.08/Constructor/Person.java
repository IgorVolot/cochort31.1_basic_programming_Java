package Constructor;

public class Person {
    String firstName;
    String lastName;
    String phoneNumber;
    MyDate birthday;

    public Person (String firstName, String lastName, String phoneNumber, MyDate birthday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.birthday=birthday;
    }

    public String toString (){
        return firstName+" "+lastName +" ("+birthday.toString()+ ")"+" phone:"+phoneNumber;
    }

}
