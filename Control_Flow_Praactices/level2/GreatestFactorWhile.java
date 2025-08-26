import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int greatestFactor = 1;
            if (number > 1) {
                int counter = number - 1;
                while (counter >= 1) {
                    if (number % counter == 0) {
                        greatestFactor = counter;
                        break;
                    }
                    counter--;
                }
                System.out.println(greatestFactor);
            } else {
                System.out.println("Enter an integer greater than 1.");
            }
        }
    }
}
