import java.util.Scanner;
public class GreatestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Number " + a + " is greatest among three");
        }
        else if(b>c && b>a){
            System.out.println("Number  " + b + " is greatest among three");
        }
        else{
            System.out.println("Number " + c + " is greatest among three");
        }
    }
}
