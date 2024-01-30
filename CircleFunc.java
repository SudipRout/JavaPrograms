import java.util.Scanner;
// Write a function that takes in the radius as input and returns the circumference of a circle

public class CircleFunc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextInt();

        printCircumference(r);
        printArea(r);
    }
    public static void printCircumference(double r){
        final double PI = 3.14;
        double Circumference = (2 * PI * r);
        System.out.println("The Circumference of the circle is: "+Circumference);
    }
    public static void printArea(double r){
        final double PI = 3.14;
        double Area = PI * (r*r);
        System.out.println("The Area of the circle is: "+Area);
    }
}
