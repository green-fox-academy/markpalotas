package Comparable2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        dominoes.add(new Domino(6, 2));
        dominoes.add(new Domino(5, 3));
        dominoes.add(new Domino(5, 1));
        dominoes.add(new Domino(1, 4));
        dominoes.add(new Domino(2, 6));
        dominoes.add(new Domino(6, 7));
        
        Collections.sort(dominoes);

        System.out.println(dominoes);
    }
}
