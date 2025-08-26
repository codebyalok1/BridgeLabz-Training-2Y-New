import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            
            if (year >= 1582) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is NOT a Leap Year");
                }
            } else {
                System.out.println("The program works only for years >= 1582.");
            }
        }
    }
}