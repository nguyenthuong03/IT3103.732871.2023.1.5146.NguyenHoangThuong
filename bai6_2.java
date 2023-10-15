import java.util.Scanner;

public class bai6_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Toi la Thuong -What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("Nguyen Hoang Thuong - How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("Nguyen Hoang Thuong - How tall are you(m)?");
        double dHeight = keyboard.nextDouble();
        // Nguyen Hoang Thuong-20215146
        System.out.println("Mrs/Ms." + strName + " ," + iAge + "year old" + "Your height is" + dHeight + ".");
    }
}