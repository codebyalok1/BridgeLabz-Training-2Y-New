import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        System.out.println("Enter the temp in celsius:- ");
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
