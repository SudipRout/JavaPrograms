import java.util.Scanner;

public class Multiple_Table {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The multiplication table of "+n+" is here:");
        for (int i=1; i<11; i++) {
            System.out.println(i*n);
        }
    }
}
