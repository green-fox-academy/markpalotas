import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class W04D01E04_WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        String yourFileName = "my-file2.txt";
        List<String> nameList = new ArrayList<>();
        nameList.add("My name is: Mark Palotas");
        try {
            Path filePath = Paths.get(yourFileName);
            Files.write(filePath, nameList);
        } catch (IOException e) {
            System.out.println("Unable to write file: " + yourFileName);
        }
    }
}
