import java.util.Scanner;

public class Generator_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String query = "";
        do {
            int theNumber = (int) (Math.random() * 200 + 1);
            int value = 0;
            System.out.println("Write any value BETWEEN 0 AND 100");
            int count = 0;
            while (value != theNumber) {
                System.out.println(count);
                value = scanner.nextInt();
                if (value > theNumber) {
                    System.out.println("Computer want value: " + theNumber);
                    System.out.println("value is bigger");
                } else if (value < theNumber) {
                    System.out.println("Computer want value: " + theNumber);
                    System.out.println("value is smaller");
                } else {
                    System.out.println("you win!!!");
                }
                count++;

            }
            System.out.println("Wold you like this is game  'Yes' or 'No'");


        } while (query.equalsIgnoreCase("y"));


    }
}
