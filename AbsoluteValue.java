import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer : ");
        int n = sc.nextInt();
        if(n<0){ // n is less than zero
            n = n * (-1);
        }
        System.out.println("The absolute vale of given integer is " +n);

    }
}
