import java.util.Scanner;

//Nguyen Hoang Thuong - 20215146
public class bai6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyen Hoang Thuong  Nhập chiều cao của tam giác: ");
        int n = scanner.nextInt();
        System.out.println("Tam giac cua ban la - Nguyen Hoang Thuong");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
