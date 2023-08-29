package homework_13;

public class hw_13_t01_gameCube {
    public static void main(String[] args) {
        System.out.println("============== Home work 03.08 Igor Volotovskyi ================\n");

        System.out.println("Task #1\n");

        // Задача 1.
        //Напишите метод, который имитирует бросание игрового кубика.
        // На вход методу подается число бросков, на выходе метод возвращает результаты всех бросков.
        // Кубик из 6 граней n = (int)(Math.random() * (6 - 1 + 1) + 1)

        int[] game = gameCube(20);

        for (int i = 0; i < game.length; i++) {
            System.out.print(game[i] + " | ");
        }
    }
    // ------------------Methods-------------------
    public static int[] gameCube(int n) {
        int[] cub = new int[n];
        for (int i = 0; i < n; i++) {
            cub [i] = (int)(Math.random() * (6 - 1 + 1) + 1);
        }
        return cub;
    }
    // --------------------------------------------
}
