package studentList_hw_16;

public class Student {
    String firstName;
    String lastName;
    MyDate birthday;
    String group;
    MyDate startCourse;

    public String toString(){
        return firstName + " " + lastName + "(" + birthday.toString() + ")" + ". Group: " + group + ". Course start: " + startCourse.toString();
    }
    public void sayHello (){
        System.out.println("Hello, I'm a student "+ firstName + " " + lastName);
    }

}
