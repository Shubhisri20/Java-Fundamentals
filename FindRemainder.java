import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter Divisor : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("The remainder when " +a+" is divided by "+b+" is " +r);
    }
}
