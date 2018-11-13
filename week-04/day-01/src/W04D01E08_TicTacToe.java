import java.util.ArrayList;
import java.util.List;

public class W04D01E08_TicTacToe {
    public static void main(String[] args) {
    }

    public static void ticTacResult(String boardPathString) {
        List<String> column1 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 0);
        List<String> column2 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 1);
        List<String> column3 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 2);
    }

    public static List<String[]> rowParser(String boardPathString) {
        List<String[]> rowsArray = new ArrayList<>();
        for (String row : W04D01E07_Logs_Improved.readFile(boardPathString)) {
            rowsArray.add(row.split(""));
        }
        return rowsArray;
    }

    public static List<String> topLeftDiagParser(String boardPathString) {

    }

    public static List<String> topRightDiagParser(String boardPathString) {

    }
}
