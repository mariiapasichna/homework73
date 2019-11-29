package com.mariiapasichna;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /*3) Написать метод который принимает массив случайных чисел.
Метод должен вернуть массив(меньшего размера) который состоит из элементов, которые больше среднего арифметического.*/

    public static void main(String[] args) {
        int arr[] = new int[10];
        createArrayAndInit(arr);
        arrayMoreAverage(arr);
    }

    private static void arrayMoreAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println(average);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int x = arr[j];
                    arr[j] = arr[i];
                    arr[i] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int count = 0;
        int arr2[] = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
                arr2 = Arrays.copyOfRange(arr, 0, i + 1);
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
    }
}
