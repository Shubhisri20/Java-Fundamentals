import java.util.Scanner;

public class SidesOfTriangle {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
