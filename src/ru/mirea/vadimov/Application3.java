package ru.mirea.vadimov;

import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        int[] firstArray;
        int[] secondArray;

        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        firstArray = new int[length];
        secondArray = new int[length];

        Random rand = new Random();

        for (int index = 0; index < length; index++) {
            firstArray[index] = rand.nextInt(-100, 100);
            secondArray[index] = rand.nextInt(-100, 100);
        }

        System.out.println(java.util.Arrays.toString(firstArray));
        System.out.println(java.util.Arrays.toString(secondArray));

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int number : firstArray) {
            uniqueNumbers.add(number);
        }

        boolean hasCommonElements = false;
        for (int number : secondArray) {
            if (uniqueNumbers.contains(number)) {
                System.out.print(number + " ");
                hasCommonElements = true;
            }
        }

        if (!hasCommonElements) {
            System.out.println("Нет одинаковых значений.");
        }
    }
}
