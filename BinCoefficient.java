public class BinCoefficient {
    public static int Factorial(int n){
        if( n < 0){
            System.out.println("Not possible since it's an invalid number");
            return n;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binCoff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int binCoff = fact_n/(fact_r * fact_nmr);
        return binCoff;
    }

   public static void main(String[] args) {
        System.out.println(binCoff(5, 2));
    }
}