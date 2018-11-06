import java.lang.reflect.Array;
import java.util.*;

public class W03D02E07_Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

//        System.out.println(girls.size());

        System.out.println(makingMatches(girls, boys));

        girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches2(girls,boys));

        girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches3(girls,boys));
    }

    public static ArrayList<String> makingMatches(ArrayList inp1, ArrayList inp2) {
        ArrayList<String> matched = new ArrayList<>();
        for (int i = 0, j = 0; i < inp1.size(); i++, j++) {
            matched.add(inp1.get(i).toString());
            matched.add(inp2.get(j).toString());
        }
        return matched;

        // With an IF within the for, you can prevent the function running into an exception when trying to pull the non-existing "last" element from the shorter list

    }

    public static ArrayList makingMatches2(ArrayList<String> women, ArrayList<String> men) {
        ArrayList<String> matches = new ArrayList<>();

        for (int i = 0; i < men.size() - 1; i++) {
            matches.add(i * 2, women.get(i));
            matches.add(i * 2 + 1, men.get(i));
        }
        return matches;
    }

    public static ArrayList makingMatches3(ArrayList inp21, ArrayList inp22) {
        String[] matchedArray = new String[inp21.size() + inp22.size()];
        for (int i = 0; i < inp21.size(); i++) {
            matchedArray[2 * i + 1] = inp21.get(i).toString();
        }
        for (int j = 0; j < inp22.size(); j++) {
            matchedArray[2 * j] = inp22.get(j).toString();
        }
        ArrayList<String> matchedArrayList = new ArrayList<String>(Arrays.asList(matchedArray));

        return matchedArrayList;
    }
}
