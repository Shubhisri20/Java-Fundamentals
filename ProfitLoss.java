import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Selling Price : ");
        int sp = sc.nextInt();
        System.out.println("Enter the Cost Price");
        int cp = sc.nextInt();
        if(sp>cp){
            System.out.println("You made a Profit of ");
            int profit = sp - cp;
            System.out.println(profit);
        }
        else{
            System.out.println("You incurred a loss of");
            int loss = cp - sp;
            System.out.println(loss);
        }
    }
}
