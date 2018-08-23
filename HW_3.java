/**
 * Java 1. Lesson 3. Homework
 *
 * @author Daria Vdovenko
 * @version dated Aug 23, 2018
 */

import java.util.Random;
import java.util.Scanner;

class HW_3 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    //call for task #1
    guessTheNumber();

    }

    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9,
     *    и пользователю дается 3 попытки угадать это число.
     *    При каждой попытке компьютер должен сообщить
     *    больше ли указанное пользователем число, чем загаданное, или меньше.
     *    После победы или проигрыша выводится запрос – 
     *    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void guessTheNumber() {
        do {
            System.out.println("Угадай число от 0 до 9");
            int numToGuess = random.nextInt(10);
            int num = -1;
            int level = 0;
            //System.out.println(numToGuess);
            while ((num != numToGuess) && (level < 3)) {
                num = scanner.nextInt();
                if (num == numToGuess) {
                    System.out.println("Правильно! Вы выиграли");
                    break;
                } else if (num > numToGuess) {
                    System.out.println("Неверно! Загаданное число меньше.");
                    level++;
                } else {
                    System.out.println("Неверно! Загаданное число больше.");
                    level++;
                }
            }
            if (level == 3) {
                System.out.println("Вы проиграли");
            }
            System.out.printf("Повторить игру?\n1 - да\n0 - нет\n");
        } while (scanner.next().equals("1"));
    }
}