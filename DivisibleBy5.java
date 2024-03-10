import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The Number you Entered is Divisible by 5");
        }
        else{
            System.out.println("The Number you Entered is not Divisible  by 5");
        }
    }
}
