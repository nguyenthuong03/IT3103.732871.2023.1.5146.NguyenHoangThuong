import java.util.Arrays;

//Nguyen Hoang Thuong - 20215146
public class bai6_5 {
    public static void main(String[] args) {
        int[] array = { 1789, 2035, 1899, 1456, 2013 };
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = (double) sum / array.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
