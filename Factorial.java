import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();

        if(num < 0) {
            System.out.println("Not possible since it's an invalid Number");
            return;
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
    }
}