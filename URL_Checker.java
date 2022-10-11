public class URL_Checker {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the website: ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
}
