import java.util.Scanner;
public class EvenOrNot{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number for check odd or even: ");
            int num=sc.nextInt();
//reads the value from the user
            findOddEven(num); //calling the method
        }

        //create a user defined method
        public static void findOddEven(int num){ //method definition
            if(num%2==0)
                System.out.println(num+" is even");
            else
                System.out.println(num+" is odd");
    }
}
