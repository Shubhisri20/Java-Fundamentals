import java.util.Scanner;

public class YoungestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Ram : ");
        int RamAge = sc.nextInt();
        System.out.println("Enter the age of Shyam : ");
        int ShyamAge = sc.nextInt();
        System.out.println("Enter the age of Ajay : ");
        int AjayAge = sc.nextInt();
        if(RamAge<ShyamAge && RamAge<AjayAge){
            System.out.println("Ram is youngest");
        }
        else if(ShyamAge<AjayAge && ShyamAge<RamAge){
            System.out.println("Shyam is youngest");
        }
        else{
            System.out.println("Ajay is youngest");
        }
    }
}
