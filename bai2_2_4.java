import javax.swing.JOptionPane;

//Nguyen Hoang Thuong - 20215146
public class bai2_2_4 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotiication = "you are just entered:";
        strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotiication += strNum1 + "and";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotiication += strNum2;
        JOptionPane.showMessageDialog(null, strNotiication, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
