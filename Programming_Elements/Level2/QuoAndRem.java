import java.util.Scanner;

public class QuoAndRem {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

        sc.close();
    }
}
}