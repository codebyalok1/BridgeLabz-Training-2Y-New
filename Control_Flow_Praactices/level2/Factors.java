import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Please enter a positive integer.");
            }
        }
    }
}
