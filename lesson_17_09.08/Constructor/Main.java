package Constructor;

public class Main {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(1,2,2000);
//        birthday.day=1;
//        birthday.month=2;
//        birthday.year=2000;

        Person person1 = new Person("John", "Connor", "123-123-123", new MyDate(1,2,2000));
//        person1.firstName="John";
//        person1.lastName="Connor";
//        person1.birthday=birthday;
//        person1.phoneNumber="123-123-123";

        Account account1 = new Account("DE1234556789", 500000,person1);
//        account1.iban = "DE1234556789";
//        account1.owner =person1;
//        account1.balance=500000;

        System.out.println(account1);

        System.out.println(account1.owner.toString());
        System.out.println(account1.owner.birthday.toString());

        MyDate birthday1 = account1.owner.birthday;
    }

}
