import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W04D01E08_TicTacToe {
    public static void main(String[] args) {
        String boardPathString = "win-o.txt";
        System.out.println(ticTacResult(boardPathString));
    }

    public static String ticTacResult(String boardPathString) {
        List<List<String>> toCheck = new ArrayList<>();
        toCheck.add(columnParser(boardPathString, 0));
        toCheck.add(columnParser(boardPathString, 1));
        toCheck.add(columnParser(boardPathString, 2));
        toCheck.add(Arrays.asList(rowParser(boardPathString).get(0)));
        toCheck.add(Arrays.asList(rowParser(boardPathString).get(1)));
        toCheck.add(Arrays.asList(rowParser(boardPathString).get(2)));
        toCheck.add(topLeftDiagParser(boardPathString));
        toCheck.add(topRightDiagParser(boardPathString));
        String winner = "Draw";
        for (int i = 0; i < toCheck.size(); i++) {
            if (!listChecker(toCheck.get(i)).equals("null")) {
                winner = listChecker(toCheck.get(i));
            }
        }
        return winner;
    }

    public static List<String[]> rowParser(String boardPathString) {
        List<String[]> rowsArray = new ArrayList<>();
        for (String row : W04D01E07_Logs_Improved.readFile(boardPathString)) {
            rowsArray.add(row.split(""));
        }
        return rowsArray;
    }

    public static List<String> columnParser(String boardPathString, int indexOfItemToBeListed) {
        List<String> columnList = new ArrayList<>();
        for (String row : W04D01E07_Logs_Improved.readFile(boardPathString)) {
            columnList.add(row.split("")[indexOfItemToBeListed]);
        } return columnList;
    }

    public static List<String> topLeftDiagParser(String boardPathString) {
        List<String> diagArray = new ArrayList<>();
        for (int i = 0; i < rowParser(boardPathString).size(); i++) {
            diagArray.add(rowParser(boardPathString).get(i)[i]);
        }
        return diagArray;
    }

    public static List<String> topRightDiagParser(String boardPathString) {
        List<String> diagArray = new ArrayList<>();
        for (int i = 0, j=2; i < rowParser(boardPathString).size(); i++, j--) {
            diagArray.add(rowParser(boardPathString).get(i)[j]);
        }
        return diagArray;
    }

    public static String listChecker(List<String> toCheck) {
        if (toCheck.get(0).equals(toCheck.get(1)) && toCheck.get(1).equals(toCheck.get(2))) {
            return toCheck.get(0);
        }
        return "null";
    }
}
