import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println("Power: " + result);
        sc.close();
    }
}
