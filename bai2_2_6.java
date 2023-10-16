import javax.swing.JOptionPane;

public class bai2_2_6 {
    public static void main(String[] args) {

        // Nguyen Hoang Thuong - 20215146 giải pt bậc 1
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a for equation ax + b = 0:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b for equation ax + b = 0:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No solution");
        } else {
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "Solution: x = " + solution);
        }

        // Nguyen Hoang Thuong 20215146 - Giải hệ pt
        double a11 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient a11 for the system of equations:"));
        double a12 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient a12 for the system of equations:"));
        double b1 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient b1 for the system of equations:"));
        double a21 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient a21 for the system of equations:"));
        double a22 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient a22 for the system of equations:"));
        double b2 = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient b2 for the system of equations:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Solution: x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "The system has infinitely many solutions");
        } else {
            JOptionPane.showMessageDialog(null, "The system has no solution");
        }

        // Nguyễn Hoàng Thương -20215146 Giải pt bậc 2
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a for equation ax^2 + bx + c = 0:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b for equation ax^2 + bx + c = 0:"));
        double c = Double
                .parseDouble(JOptionPane.showInputDialog("Enter coefficient c for equation ax^2 + bx + c = 0:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This is not a quadratic equation");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "The equation has no real roots");
            } else if (delta == 0) {
                double root = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one root: x = " + root);
            } else {
                double root1 = (-b - Math.sqrt(delta)) / (2 * a);
                double root2 = (-b + Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two roots: x1 = " + root1 + ", x2 = " + root2);
            }
        }
    }
}
