//To print a factorial of a number using function

import java.util.Scanner;
public class Factorial_Func {
    public static void printFactorial(int n){
        if( n < 0){
            System.out.println("Not possible since it's an invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of "+n+" is: " +factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}