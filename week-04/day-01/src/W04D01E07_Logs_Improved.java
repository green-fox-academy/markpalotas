import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class W04D01E07_Logs_Improved {
    public static void main(String[] args) {

//    IMPROVEMENTS over W04D01E07_Logs.java are:
//    - better conformance with SOLID by splitting up the itemList method into a filereader method and a parser
//    - also improved parsing algorithm without unnecessary tempArrayLength variable

        System.out.println(makeListUnique(listGivenItem(readFile("log.txt"),5)));
        System.out.println("The GET to POST ratio is: " + getToPostRatio("log.txt").get(0) + " : " + getToPostRatio("log.txt").get(1));
    }

    public static List<String> readFile(String logPathString) {
        List<String> contentOfFile = new ArrayList<>();
        try {
            Path logPath = Paths.get(logPathString);
            contentOfFile = Files.readAllLines(logPath);
        } catch (IOException e) {
            System.out.println("Could not read file: " + logPathString);
        }
        return contentOfFile;
    }

    public static List<String> listGivenItem(List<String> contentOfFile, int indexOfItemToBeListed) {
        List<String> givenItemList = new ArrayList<>();
        for (String row : contentOfFile) {
            givenItemList.add(row.split("//s+")[indexOfItemToBeListed]);
        } return givenItemList;
    }

    public static List<String> makeListUnique(List<String> givenItemList) {
        List<String> uniqueList = new ArrayList<>();
        for (int i = 0; i < givenItemList.size(); i++) {
            if (!uniqueList.contains(givenItemList.get(i))) {
                uniqueList.add(givenItemList.get(i));
            }
        }
        return uniqueList;
    }

    public static List<Integer> getToPostRatio(String logPathString) {
        List<Integer> getToPost = new ArrayList<>();
        String string1 = "GET";
        String string2 = "POST";
        getToPost.add(Collections.frequency(listGivenItem(readFile("log.txt"),6), string1));
        getToPost.add(Collections.frequency(listGivenItem(readFile("log.txt"),6), string2));
        return getToPost;
    }
}
