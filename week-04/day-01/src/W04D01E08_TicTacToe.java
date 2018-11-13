import java.util.List;

public class W04D01E08_TicTacToe {
    public static void main(String[] args) {
        String boardPathString = "win-o.txt"
        List<String> column1 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 0);
        List<String> column2 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 1);
        List<String> column3 = W04D01E07_Logs_Improved.listGivenItem(W04D01E07_Logs_Improved.readFile(boardPathString), 2);
        ticTacResult(column1, column2, column3);
    }

    public static void ticTacResult(List<String> column1, List<String> column2, List<String> column3) {

    }
}
