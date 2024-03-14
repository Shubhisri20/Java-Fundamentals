import java.util.Scanner;
public class PercentageElseIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        if(marks  > 90){
            System.out.println("Excellent");
        }
        else if(marks > 80){
            System.out.println("Very Good");
        }
        else if(marks > 70){
            System.out.println("Good");
        }
        else if(marks > 60){
            System.out.println("Can do Better");
        }
        else if(marks > 50){
            System.out.println("Average Marks");
        }
        else if(marks > 40){
            System.out.println("Bellow Average");
        }
        else{
            System.out.println("Fail");
        }

    }
}
