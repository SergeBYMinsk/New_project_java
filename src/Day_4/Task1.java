package Day_4;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int countBigger8 = 0;
            int countValue1 = 0;
            int countEvenNumbers = 0;
            int countNotEvenNumbers = 0;
            int sumAllElementArray = 0;
            int sizeOfTheArray = scanner.nextInt();
            int[] list = new int[sizeOfTheArray];
            for (int i = 0; i < sizeOfTheArray; i++) {
                System.out.println("Enter the: " + (i + 1) + " element of array ");
                int value = scanner.nextInt();
                list[i] = value;
                if (value > 8)
                    countBigger8++;
                if (value == 1)
                    countValue1++;
                if (value % 2 == 0)
                    countEvenNumbers++;
                if (value % 2 != 0)
                    countNotEvenNumbers++;
                continue;
            }
            System.out.println(Arrays.toString(list));
            for (int i = 0; i < list.length; i++) {
                sumAllElementArray += list[i];
                System.out.println("Arrays values:- " + "element number:- " + (i + 1) + " = " + list[i]);
            }
            System.out.println("The length of the array is: " + sizeOfTheArray + " elements!");
            System.out.println("Numbers of number greater than 8:- " + countBigger8);
            System.out.println("The number of units in the array:- " + countValue1);
            System.out.println("The number of event numbers:- " + countEvenNumbers);
            System.out.println("The number is not event numbers:- " + countNotEvenNumbers);
            System.out.println("The sum of all elements of array is: - " + sumAllElementArray);
        }
    }
}
