import java.util.Scanner;

public class ThreePointsLiesOnXYorOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point x : ");
        int x = sc.nextInt();
        System.out.println("Enter the point y : ");
        int y = sc.nextInt();
        if(x == 0 && y== 0 ){
            System.out.println("The point lies on origin");
        }
        else if (x==0){
            System.out.println("The point lies on y-axis");
        }
        else if (y==0){
            System.out.println("The point lies on x-axis");
        }
        else{
            System.out.println("Not matching with conditionso");
        }
    }
}
