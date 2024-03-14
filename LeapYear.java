import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("The Year you entered is a  Leap Year");
        }
        else if (year%100==0) {
            System.out.println("The Year You Entered is a Leap Year");
        }
        else if(year%4==0){
            System.out.println("The Year you Entered is a Leap Year");
        }
        else{
            System.out.println("The year you Entered is not a Leap Year");
        }
    }
}
