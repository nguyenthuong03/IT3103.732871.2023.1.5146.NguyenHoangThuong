
//Nguyen Hoang Thuong 20215146
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\OOP\\lab03\\src\\hust\\soict\\dsai\\garbage\\text.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;

        }
        endTime = System.currentTimeMillis();
        System.out.println("thoi gian doc la" + (endTime - startTime) / 1000);
    }
}
