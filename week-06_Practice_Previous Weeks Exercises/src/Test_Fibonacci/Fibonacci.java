package Test_Fibonacci;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a positive integer:");
//        try {
//            int n = scanner.nextInt();
//            System.out.println(fibo(n));
//        } catch (InputMismatchException e) {
//            System.out.println("What you entered is not a positive integer, thus I can't work with it.");
//        }
        try {
            System.out.println(fibo(askForInput()));
        } catch (InputMismatchException e) {
            System.out.println("What you entered is not a positive integer, thus I can't work with it.");
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static int askForInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int n = scanner.nextInt();
        if (n < 0) {
            throw new InputMismatchException();
        }
        return n;
    }
}
