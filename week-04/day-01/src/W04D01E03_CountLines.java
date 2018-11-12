import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class W04D01E03_CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of your file:");
        String yourFileName = scanner.nextLine();
//        String yourFileName = "my-file.txt";
        System.out.println(countLine(yourFileName));
    }

    public static int countLine(String fileName) {
        Path filePath = Paths.get(fileName);
        int numOfLines = 0;
        try {
            List<String> linesInFile = Files.readAllLines(filePath);
            numOfLines = linesInFile.size();
        } catch (IOException e) {
            numOfLines = 0;
        } catch (Exception e) {
        }
        return numOfLines;
    }
}

