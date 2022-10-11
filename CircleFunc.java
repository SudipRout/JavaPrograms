import java.util.Scanner;
// Write a function that takes in the radius as input and returns the circumference of a circle

public class CircleFunc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextInt();

        printCircumference(r);
    }
    public static void printCircumference(double r){
        final double PI = 3.14159;
        double Circumference = (2 * PI * r);
        System.out.println("The Circumference of the circle is: "+Circumference);
    }
}
