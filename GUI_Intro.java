import javax.swing.JOptionPane;

public class GUI_Intro {
    public static void main(String []args) {
        //Scanner sc=new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}
