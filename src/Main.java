import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Игра угадай число ");

        playLevel();
        scanner.close();

    }

    public static void playAgain() {
        String scannerText;
        while (true) {
            System.out.println("Введите \"да\", если хотите продолжить игру");
            scannerText = scanner.next();
            if (scannerText.equals("да")) {
                playLevel();
            } else {
                scanner.close();
            }
            break;
        }
    }

    public static void playLevel() {
        System.out.println("Введите диапазон числа: ");
        int range = (int) (Math.random() * scanner.nextInt());
        System.out.println("Введите число: ");
        int input_number = scanner.nextInt();
        while (true) {
            if (input_number == range) {
                System.out.println("Вы угадали !");
                playAgain();
                break;
            } else if (input_number < range) {
                System.out.println("Загаданное число больше, попробуйте ещё раз");
                input_number = scanner.nextInt();
            } else if (input_number > range) {
                System.out.println("Загаданное число меньше, попробуйте ещё раз");
                input_number = scanner.nextInt();
            }
        }
        scanner.close();
    }
}