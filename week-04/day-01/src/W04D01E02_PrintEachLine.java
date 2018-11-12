import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class W04D01E02_PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        String fileName = "my-file.txt";
        Path filePath = Paths.get(fileName);
        try {
            List<String> linesInFile = Files.readAllLines(filePath);
            System.out.print(linesInFile.get(0) + "\n" + linesInFile.get(1));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem with the file you are trying to read: " + "my-file.txt");
        }
    }
}