import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Taking input from the user......");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.print("You have entered " + num1);
        System.out.print(" and ");
        System.out.println(num2);

        String prompt = "Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division";
        System.out.println(prompt);

        int input = sc.nextInt();
        switch (input) {
            case 1: System.out.println("Adding these numbers.....");
                    System.out.println(num1 + num2);
                    break;
            case 2: System.out.println("Subtracting these numbers.....");
                    System.out.println(num1 - num2);
                    break;
            case 3: System.out.println("Multiplying these numbers.....");
                    System.out.println(num1 * num2);
                    break;
            case 4: System.out.println("Dividing these numbers.....");
                    System.out.println(num1 / num2);
                    break;
            default:
            System.out.println("Invalid input!");
        }
    }
}