import java.util.Scanner;
public class SumOfTwoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of two numbers is " +sum);
    }
}
