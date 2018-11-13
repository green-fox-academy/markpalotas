import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W04D01E08_TicTacToe {
    public static void main(String[] args) {
    }

    public static void ticTacResult(String boardPathString) {
        List<String> toCheck1 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 0);
        List<String> toCheck2 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 1);
        List<String> toCheck3 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 2);
        List<String> toCheck4 = Arrays.asList(rowParser(boardPathString).get(0));
        List<String> toCheck5 = Arrays.asList(rowParser(boardPathString).get(1));
        List<String> toCheck6 = Arrays.asList(rowParser(boardPathString).get(2));
        List<String> toCheck7 = topLeftDiagParser(boardPathString);
        List<String> toCheck8 = topRightDiagParser(boardPathString);
    }

    public static List<String[]> rowParser(String boardPathString) {
        List<String[]> rowsArray = new ArrayList<>();
        for (String row : W04D01E07_Logs_Improved.readFile(boardPathString)) {
            rowsArray.add(row.split(""));
        }
        return rowsArray;
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

    }
}
