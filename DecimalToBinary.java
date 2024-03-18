import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int decimal_num = sc.nextInt();

        int ans = 0; //converted decimal number
        int pw = 1; //2^0 = 1 power of 2

        while(decimal_num > 0){
            int parity = decimal_num % 2;
            ans += (parity * pw);
            decimal_num /= 2;
            pw *= 10;
        }
        System.out.println("The binary of given decimal number is: " +ans);
    }
}
