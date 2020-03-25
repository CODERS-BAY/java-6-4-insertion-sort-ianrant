package com.codersbay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanSortSize = new Scanner(System.in);
        Scanner scanMaxValue = new Scanner(System.in);

        System.out.println("How many numbers do you want to sort? (integer!)");
        int howMany = scanSortSize.nextInt() + 1;

        System.out.println("Enter the max number of the sort! (integer!");
        int howLarge = scanMaxValue.nextInt();

        int[] preSort = new int[howMany]; // allocate size to array

        for (int i = 0; i < howMany; i++) {
            int temp = generateRandom(howLarge);

            for (int j = 0; j < howMany; j++) {
                preSort[i] = temp;
            }
        }

        System.out.println();
        System.out.println("These are your randomly generated numbers:");
        System.out.println(Arrays.toString(preSort));
        System.out.println();
        numbersSort(preSort);
    }

    public static int generateRandom(int max) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(max);
    }

    public static void numbersSort(int[] finalSort) {

        int k = 0;
        int temp = 0;

        for (int i = 0; i < finalSort.length; i++) {
            temp = finalSort[i];
            k = i;
            while ((k > 0) && (finalSort[k - 1] > temp)) {
                finalSort[k] = finalSort[k - 1];
                k--;
            }
            finalSort[k] = temp;

            System.out.println(Arrays.toString(finalSort));
        }
    }
}