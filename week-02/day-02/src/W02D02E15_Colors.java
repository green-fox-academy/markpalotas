import java.util.Arrays;

public class W02D02E15_Colors {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`
        String[][] colors = new String[3][5];

        String[] greens = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] reds = {"orange red", "red", "tomato"};
        String[] pinks = {"orchid", "violet", "pink", "hot pink"};
        colors[0] = greens;
        colors[1] = reds;
        colors[2] = pinks;
        System.out.println(Arrays.deepToString(colors));
        System.out.println();
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
