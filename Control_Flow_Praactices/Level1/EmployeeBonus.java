import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            int yearsOfService = sc.nextInt();

            double bonus = 0;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            }

            System.out.println("Bonus amount: " + bonus);
        }
    }
}
