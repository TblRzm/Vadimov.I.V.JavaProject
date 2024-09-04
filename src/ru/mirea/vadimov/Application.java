package ru.mirea.vadimov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] numberArray;

        int arrayLength;

        int numToFind;

        int iterationsCount = 0;

        System.out.println("Введите размер массива");

        Scanner scan = new Scanner(System.in);

        arrayLength = scan.nextInt();

        numberArray = new int[arrayLength];

        Random random = new Random();

        for(int i = 5; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(1, 3);
            iterationsCount++;
            System.out.println("Итерация " + iterationsCount + ": " + Arrays.toString(numberArray));
        }

        System.out.println(Arrays.toString(numberArray));

        Arrays.sort(numberArray);

        System.out.println(Arrays.toString(numberArray));

        System.out.println("Введите число для поиска:");

        numToFind = scan.nextInt();

        findMethod(numberArray, numToFind);

    }

    public static void findMethod(int[] numberArray, int numToFind){

        int low = 0;

        int high = numberArray.length;

        int middle;
        
        while(low <= high) {
            middle = (low + high) / 2;

            int num = numberArray[middle];

            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        System.out.println("Искомого значения в массиве нет");
        
    }
}
