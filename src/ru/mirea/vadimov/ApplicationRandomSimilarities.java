package ru.mirea.vadimov;

import java.util.*;

public class ApplicationRandomSimilarities {

    public static void main(String[] args){

        int[] numberArray;
        int[] numberArray2;

        System.out.println("Введите размер массивов:");

        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        numberArray = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(1, 300);
        }

        System.out.println("Первый массив создан: \n" + Arrays.toString(numberArray));

        numberArray2 = new int[arrayLength];

        for (int i = 0; i < numberArray2.length; i++) {
            numberArray2[i] = random.nextInt(1, 300);
        }

        System.out.println("Второй массив создан: \n" + Arrays.toString(numberArray2));

        Set<Integer> mutualNumbers = new HashSet<>();

        Arrays.sort(numberArray);
        Arrays.sort(numberArray2);

        for (int num1 : numberArray) {
            for (int num2 : numberArray2) {
                if (num1 == num2) {
                    mutualNumbers.add(num1);

                }
            }
        }


        ArrayList<Integer> sortedMutualNumbers = new ArrayList<>(mutualNumbers);

        Set<Integer> uniqueMutualNumbers = new HashSet<>(sortedMutualNumbers);
        sortedMutualNumbers.clear();
        sortedMutualNumbers.addAll(uniqueMutualNumbers);

        Collections.sort(sortedMutualNumbers);

        System.out.println("Общие числа: " + sortedMutualNumbers);
    }

}
