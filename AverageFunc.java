import java.util.Scanner;

public class AverageFunc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        printAverage(a, b, c);
    }
    public static void printAverage(double a, double b, double c) {
        double avg = (a+b+c)/3;
        System.out.println("The average of the three numbers are: "+avg);
    }
}
