import java.util.Scanner;

public class PowerSqFunc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        double n = sc.nextInt();

        printPower(x,n);
    }
    static void printPower(double x, double n){
        double z =  Math.pow( x, n);
        System.out.println(z);
    }
}
