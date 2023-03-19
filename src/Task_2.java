import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name city");
            String city = scanner.next();
            if (city.equalsIgnoreCase("stop"))
            {
                System.out.println("You want to exit the program 'Y' or 'N'");
                String result = scanner.next();
                if (result.equalsIgnoreCase("y"))
                {
                    System.out.println("Good bye");
                    break;
                }
            } else {
                System.out.println("city name: " + city);
            }
            if ((city.equalsIgnoreCase("minsk")) || (city.equalsIgnoreCase("brest")) || (city.equalsIgnoreCase("gomel"))) {
                System.out.println("This is republic of belarus");
            }
            switch (city) {
                case "Moscow":
                case "Vladik":
                case "Rostov":
                    System.out.println("This is Russia");
                    break;
                case "Rim":
                case "Milan":
                case "Turin":
                    System.out.println("This is Italia");
                    break;
                case "Berlin":
                case "Munich":
                    System.out.println("Thi is Germany");
                    break;
                default: {
                    System.out.println("I don`t know this city");
                }
            }
        }
    }
}
