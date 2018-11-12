import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class W04D01E07_Logs {
    public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
        System.out.println(makeListUnique(itemList("log.txt",5)));
        System.out.println("The GET to POST ratio is: " + getToPostRatio("log.txt").get(0) + " : " + getToPostRatio("log.txt").get(1));
    }

    public static List<String> itemList(String logPathString, int indexOfItemToBeListed) {
        List<String> fullItemList = new ArrayList<>();
        List<String> splitContent = new ArrayList<>();
        try {
            Path logPath = Paths.get(logPathString);
            List<String> logContent = Files.readAllLines(logPath);
            int tempArrayLength = 0;
            for (int i = 0; i < logContent.size(); i++) {
                String[] tempArray = logContent.get(i).split("\\s+");
                for (int j = 0; j < tempArray.length; j++) {
                    splitContent.add(tempArray[j]);
                }
                tempArrayLength = tempArray.length;
            }
            for (int i = indexOfItemToBeListed; i < splitContent.size(); i += tempArrayLength) {
                fullItemList.add(splitContent.get(i));
            }
        } catch (IOException e) {
            System.out.println("Could not open file: " + logPathString);
        }
        return fullItemList;
    }

    public static List<String> makeListUnique(List<String> fullItemList) {
        List<String> uniqueList = new ArrayList<>();
        for (int i = 0; i < fullItemList.size(); i++) {
            if (!uniqueList.contains(fullItemList.get(i))) {
                uniqueList.add(fullItemList.get(i));
            }
        }
        return uniqueList;
    }

    public static List<Integer> getToPostRatio(String logPathString) {
        List<Integer> getToPost = new ArrayList<>();
        String string1 = "GET";
        String string2 = "POST";
        List<String> fullItemList = itemList(logPathString, 6);
        getToPost.add(Collections.frequency(fullItemList, string1));
        getToPost.add(Collections.frequency(fullItemList, string2));
        return getToPost;
    }
}
