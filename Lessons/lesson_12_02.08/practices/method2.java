package practices;

public class method2 {
    public static void main(String[] args) {
        System.out.println(checkNumbers(150));

    }

    // Написать метод, который принимает число и проверяет, является ли число двухзначным или трехзначным.
    // Метод возвращает строку, в которой отвечает на этот вопрос

    public static String checkNumbers(int num){
        if (num >= 10 && num < 100)
            return num + " is two-digit number";
        else if (num >= 100 && num < 1000)
            return num + " is three-digit number";
        else // в данном случае можно не прописывать
            return "This is not two or three digit number";
    }
}
