import java.util.Scanner;

public class nested3Or5ButNot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0) {
            if (n % 15 != 0) {
                System.out.println("The number you entered is divisible by either 5 or 3 but not divisible by 15");
            } else {
                System.out.println("Not matching the required condition");
            }
        }
        else {
            System.out.println("Not matching the required condition");
        }
    }
}
