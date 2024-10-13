import javax.swing.JOptionPane;

public class gui {
    
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter name: ");
        JOptionPane.showInputDialog(null,"Hello"+name);

        int age  = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showInputDialog(null,"You are "+ age + "Years old");

    }
    
}
