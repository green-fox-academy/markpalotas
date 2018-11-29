package Lottery;

import Doubled.Doubled;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lottery {
    public static void main(String[] args) {
        List<String> content = Doubled.readFile(askForPath());
        List<Integer[]> drawArrays = convertToInt(splitLotteryNumbers(filterOutLotteryNumbers(content)));
        TreeMap<Integer, List<Integer>> reversedMap = reverseMap(countLotteryNumbers(drawArrays));
        int howMany = 5;
        List<List<Integer>> result = getMostFrequent(reversedMap, howMany);
        System.out.println("The " + howMany + " most frequent lottery numbers are: ");
        System.out.println(Arrays.toString(result.get(0).toArray()));
        System.out.println("with the following frequencies, respectively:");
        System.out.println(Arrays.toString(result.get(1).toArray()));
    }

    public static Path askForPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path to the lottery stats file:");
        return Paths.get(scanner.nextLine());
    }

    public static List<String> filterOutLotteryNumbers(List<String> input) {
        List<String> output = new ArrayList<>();
        String patternStr = "(\\d+;){4}\\d+";
        Pattern pattern = Pattern.compile(patternStr);
        for (int i = 0; i < input.size(); i++) {
            Matcher matcher = pattern.matcher(input.get(i));
            if (matcher.find()) {
                output.add(input.get(i).substring(matcher.start()));
            }
        }
        return output;
    }

    public static List<String[]> splitLotteryNumbers(List<String> input) {
        List<String[]> output = new ArrayList<>();
        for (String line : input) {
            output.add(line.split(";"));
        }
        return output;
    }

    public static List<Integer[]> convertToInt(List<String[]> input) {
        List<Integer[]> output = new ArrayList<>();
        for (String[] line : input) {
            Integer[] temp = new Integer[5];
            for (int i = 0; i < line.length; i++) {
                temp[i] = (Integer) (Integer.parseInt(line[i]));
            }
            output.add(temp);
        }
        return output;
    }

    public static Map<Integer, Integer> countLotteryNumbers(List<Integer[]> input) {
        Map<Integer, Integer> lotteryStat = new TreeMap<>();
        for (int i = 1; i < 91; i++) {
            lotteryStat.put(i, 0);
        }
        for (Integer[] oneDraw : input) {
            for (int j = 0; j < oneDraw.length; j++) {
                lotteryStat.put(oneDraw[j], lotteryStat.get(oneDraw[j]) + 1);
            }
        }
        return lotteryStat;
    }

    public static TreeMap<Integer, List<Integer>> reverseMap(Map<Integer, Integer> input) {
        TreeMap<Integer, List<Integer>> reversedMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : input.entrySet()) {
            Integer lotteryNumber = entry.getKey();
            Integer frequency = entry.getValue();
            if (reversedMap.containsKey(frequency)) {
                reversedMap.get(frequency).add(lotteryNumber);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(lotteryNumber);
                reversedMap.put(frequency, temp);
            }
        }
        return reversedMap;
    }

    public static List<List<Integer>> getMostFrequent(TreeMap<Integer, List<Integer>> reversedMap, int howMany) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> frequencies = new ArrayList<>();
        List<Integer> lotteryNumbers = new ArrayList<>();
        int remaining = howMany;
        for (int i = remaining; i > 0; i--) {
            for (int j = 0; j < reversedMap.lastEntry().getValue().size() && remaining > 0; j++) {
                lotteryNumbers.add(reversedMap.lastEntry().getValue().get(j));
                frequencies.add(reversedMap.lastKey());
                remaining--;
            }
            reversedMap.remove(reversedMap.lastKey());
        }
        result.add(lotteryNumbers);
        result.add(frequencies);
        return result;
    }
}
