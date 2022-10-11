//To print a factorial of a number using function
import java.util.Scanner;
public class Factorial_Function {
        public static void printFactorial(int n) {
            //loop
            if(n < 0) {
                System.out.println("not possible since it's an invalid Number");
                return;
            }
            int factorial = 1;
            for (int i=n; i>=1; i--) {
                factorial = factorial * i;
            }
            System.out.println(factorial);

        }
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            System.out.println("The factorial of "+n+" is");
            printFactorial(n);
        }
}
