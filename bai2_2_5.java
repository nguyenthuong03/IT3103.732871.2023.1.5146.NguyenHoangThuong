import javax.swing.JOptionPane;

public class bai2_2_5 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Hoang Thuong -20215146-Please input the first number:",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Nguyen Hoang Thuong -20215146-Please input the second number:",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        if (num1 / num2 == 0) {
            JOptionPane.showMessageDialog(null, "Loi chia cho 0");

        }
        JOptionPane.showMessageDialog(null,
                "Nguyen Hoang Thuong -20215146\n" + "The sum of those two number is:" + (num1 + num2) + "\n"
                        + " The difference of those two number is :" + (num1 - num2) + "\n"
                        + "The product of those two number is:" + (num1 * num2) + "\n"
                        + "The qoutient of those number is:" + (num1 / num2) + "\n",
                "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}