package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int compNumber = 0;
        int userNumber = 0;
        int difficult;
        int countTryes = 0;
        int max = 0;

        System.out.println("Выберите уровень сложности от 1 до 3");
        difficult = input.nextInt();

        switch (difficult) {
            case 1:
                compNumber = random.nextInt(100) + 1;
                break;
            case 2:
                compNumber = random.nextInt(300) + 1;
                break;
            case 3:
                compNumber = random.nextInt(500) + 1;
                break;
        }
        do {
            max = userNumber;

            switch (difficult) {
                case 1:
                    System.out.println("Введите любое число: ");
                    userNumber = input.nextInt();
                    break;
                case 2:
                    System.out.println("Введите любое число: ");
                    userNumber = input.nextInt();
                    break;
                case 3:
                    System.out.print("Введите любое число: ");
                    userNumber = input.nextInt();
                    break;
            }
            switch (userNumber) {
                case 666:
                    System.out.print("Ave Satana! ");
                    break;
                case 777:
                    System.out.print("Азино три топора,началась игра! ");
                    break;
            }

            if (userNumber > compNumber) {
                System.out.println("Введите число меньше " + userNumber);
            } else if (userNumber < compNumber) {
                System.out.println("Введите число от " + userNumber + " до " + max);
            }
            countTryes++;
        } while (compNumber != userNumber);
        System.out.println("Поздравляем, вы угадали число ");
        System.out.println("Вы сделали " + countTryes + " попыток");
        if (countTryes < 5) {
            System.out.println("Велиций мастер Ши-Фу");
        } else if (countTryes >= 5 && countTryes < 10) {
            System.out.println("Подмастерье");
        } else if (countTryes >= 10 && countTryes <= 15) {
            System.out.println("Ученик");
        }

    }
}
