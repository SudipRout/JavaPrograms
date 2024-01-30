import java.util.*;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("First number is the largest!");
        }
        else if(num2 >= num3){
            System.out.println("Second number is the largest!");   
        }
        else {
            System.out.println("Third number is the largest!");
        }
    }
}