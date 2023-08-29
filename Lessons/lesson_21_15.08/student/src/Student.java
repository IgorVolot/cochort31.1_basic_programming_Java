package src;

public class Student {
    private String name;
    private static int questionsCounter;
//    private static int []arr;

    static {               // еще один способ инициализации
//        arr=new int[5];
//        arr[0]=5;
//        arr[3]=5;
//        arr[4]=5;
        questionsCounter = 0;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " + name;
    }

    public void ask() {
        questionsCounter++;
        System.out.println(name + " ask the question #" + questionsCounter);
    }

}
