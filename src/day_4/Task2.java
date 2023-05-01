package day_4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            ;
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int counter = 0;
        int sumCounter = 0;

        for (int element : array) {
            if (element > max)
                max = element;
        }
        for (int element : array) {
            if (element < min)
                min = element;
        }
        for (int element : array) {
            if (element % 10 == 0) {
                counter++;
                sumCounter += element;
                System.out.println(element);
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(counter);
        System.out.println(sumCounter);


    }
}
