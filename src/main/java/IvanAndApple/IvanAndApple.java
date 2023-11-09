package IvanAndApple;

import java.util.Scanner;

public class IvanAndApple {
    public static void all() {
        Scanner scannerName = new Scanner(System.in);
        String inputName;

        System.out.println("Введите имя");
        inputName = scannerName.nextLine();

        Scanner scannerApple = new Scanner(System.in);
        int inputApple;

        System.out.println("Введите количество яблок от 1 до 100");
        inputApple = scannerApple.nextInt();
        if (inputApple < 0 || inputApple > 100) {
            System.out.println("Введите корректное количество яблок от 1 до 100");
            return;
        }

        String[] AppleWordAll = {"яблок", "яблоко", "яблока"};

        int result = inputApple;
        if (result > 5 && result <= 20) {
            System.out.println(inputName + " хранит " + inputApple + " " + AppleWordAll[0]);
            return;
        }

        result = inputApple % 10;
        if (result == 0) {
            System.out.println(inputName + " хранит " + inputApple + " " + AppleWordAll[0]);
        }
        if (result >= 2 && result <= 4) {
            System.out.println(inputName + " хранит " + inputApple + " " + AppleWordAll[2]);
        }
        if (result >= 5 && result < 9 || result == 9) {
            System.out.println(inputName + " хранит " + inputApple + " " + AppleWordAll[0]);
        }
        if (result == 1 ) {
            System.out.println(inputName + " хранит " + inputApple + " " + AppleWordAll[1]);
        }
    }
}


