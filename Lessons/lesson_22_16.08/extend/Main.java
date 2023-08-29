package extend;

public class Main {
    public static void main(String[] args) {
        Employee p1=new Programmer("John", 5000);
        Programmer p2 = new Programmer("Nick", 3000);

        Employee q1=new QAEngineer("Ann", 4000);
        QAEngineer q2=new QAEngineer("Sten", 5500);

        Employee s1=new SupportEngineer("Lena", 4200);
        SupportEngineer s2=new SupportEngineer("Jack", 3500);

        p1.work();
        p1.paidSalary();

        p1.writeCode();
        q1.writeCode();
        s1.writeCode();

        q1.work();
        q1.paidSalary();

        s1.work();
        s1.paidSalary();

        System.out.println("----------------------------");

        Employee[] employees={p1,p2,q1,q2,s1,s2};
        for (Employee e:employees){
            e.work();
        }

    }
}
