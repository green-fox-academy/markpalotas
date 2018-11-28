package Doubled;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubled {
    public static void main(String[] args) {
        writeFile(askForPath("output"), decryptStringList(readFile(askForPath("input"))));
    }

    public static Path askForPath(String inputOrOutput) {
        Scanner scanner = new Scanner(System.in);
        String input = "Please enter the path of the file to be decrypted:";
        String output = "Please enter the path of the file to write the decrypted text to:";
        System.out.println((inputOrOutput.equals("input") ? input : output));
        String path = scanner.nextLine();
        return Paths.get(path);
    }

    public static List<String> readFile(Path filePath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Input file couldn't be read");
        }
        return lines;
    }

    public static void writeFile(Path filePath, List<String> newContent) {
        try {
            Files.write(filePath, newContent);
        } catch (IOException e) {
            System.out.println("Output file cannot be written");
        }
    }

    public static String removeEverySecondCharacter(String input) {
        String output = "";
        for (int i = 1; i < input.length(); i+=2) {
            output = output + input.substring(i, i + 1);
        }
        return output;
    }

    public static List<String> decryptStringList(List<String> encrypted) {
        List<String> decrypted = new ArrayList<>();
        for (String line : encrypted) {
            decrypted.add(removeEverySecondCharacter(line));
        }
        return decrypted;
    }
}
