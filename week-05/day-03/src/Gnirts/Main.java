package Gnirts;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("0123456789mutymurutty");
        System.out.println(gnirts.charAt(3));
        System.out.println(gnirts.length());
        System.out.println(gnirts.subSequence(2, 4));
    }
}
