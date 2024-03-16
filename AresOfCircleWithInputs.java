import java.util.Scanner;
public class AresOfCircleWithInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int radius = sc.nextInt();
        double pi = 3.1415, area = pi * radius * radius;
        System.out.println("The area of Circle is " +area);

    }
}
