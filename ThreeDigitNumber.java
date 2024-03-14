import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("The number you entered is a 3 Digit Number");
        }
        else{
            System.out.println("The number you entered is not a 3 Digit Number");
        }
    }
}
