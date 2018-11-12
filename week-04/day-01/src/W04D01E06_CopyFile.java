import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W04D01E06_CopyFile {
    public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path to the file you wish to copy:");
        String fromPathString = scanner.nextLine();
        System.out.println("Now the path to the target file:");
        String toPathString = scanner.nextLine();
        System.out.println(fileCopy(fromPathString, toPathString));
    }

    public static boolean fileCopy(String fromPathString, String toPathString) {
        boolean copySuccess = true;
        List<String> content = new ArrayList<>();
        try {
            Path fromPath = Paths.get(fromPathString);
            content = Files.readAllLines(fromPath);
        } catch (Exception e) {
            copySuccess = false;
        }
        if (copySuccess) {
            try {

                Path toPath = Paths.get(toPathString);
                Files.write(toPath, content);
            } catch (Exception e) {
                copySuccess = false;
            }
        }
        return copySuccess;
    }
}
