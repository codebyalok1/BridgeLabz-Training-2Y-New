import java.util.Scanner;
import java.lang.Math;
public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
        sc.close();
    }
}
