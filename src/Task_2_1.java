import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5) {
            System.out.println(" You have five attempts, this attempt number: " + counter);
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Enter two value a/b");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();

            if (b == 0) {
                System.out.println(" can`t divide by zero");

            } else if (b != 0) {
                System.out.println(" You enter two values " + a + " / " + b);
                double resultDivide = a / b;
                System.out.println(a + " / " + b + " = " + resultDivide);
            }
            if (counter == 5) {
                System.out.println("This is last attempt");
            }


            counter++;

        }
    }
}