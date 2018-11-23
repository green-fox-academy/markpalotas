public class W02D01_DrawChessTable {
    public static void main(String[] args) {
        String a = "%";
        String b = " ";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(a + b);
                }
                System.out.print("\n");
            } else {
                for (int j = 0; j < 4; j++) {
                    System.out.print(b + a);
                }
                System.out.print("\n");
            }
        }
    }
}
