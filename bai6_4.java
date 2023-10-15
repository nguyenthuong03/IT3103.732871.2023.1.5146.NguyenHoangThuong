import java.util.Scanner;
//Nguyen Hoang Thuong - 20215146
public class bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        while (true) {
            System.out.print("Nguyen Hoang Thuong - 20215146 Nhap thang: ");
            String monthInput = scanner.nextLine();
            System.out.print("Nhap nam: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            int month = -1;
            for (int i = 0; i < months.length; i++) {
                if (months[i].equalsIgnoreCase(monthInput) || months[i].substring(0, 3).equalsIgnoreCase(monthInput)
                        || String.valueOf(i + 1).equals(monthInput)) {
                    month = i;
                    break;
                }
            }
            if (month != -1 && year > 0) {
                if (month == 1 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("Thang " + months[month] + " nam " + year + " co 29 ngay.");
                } else {
                    System.out.println("Thang " + months[month] + " nam " + year + " co " + days[month] + " ngay.");
                }
                break;
            } else {
                System.out.println("Thang hoac nam khong hop le. Vui long nhap lai.");
            }
        }
    }
}
