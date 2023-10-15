import javax.swing.JOptionPane;

public class bai2_2_3 {
    public static void main(String[] args) {
        String resultl;
        resultl = JOptionPane.showInputDialog("Nguyen Hoang Thuong -20215146- Please enter your name: ");
        JOptionPane.showMessageDialog(null, "hi" + resultl + "!");
        System.exit(0);
    }
}