package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> initDominoes = new ArrayList<Domino>();
        initDominoes = dominoes;
        List<Domino> tempDominoes = new ArrayList<Domino>();
        tempDominoes = dominoes;

        do {
            int firstDomino = (int) (Math.random() * (5 + 1));
            tempDominoes.add(dominoes.get(firstDomino));
            dominoes.remove(firstDomino);
            for (Domino domino : dominoes) {
                if (domino.getLeftSide() == tempDominoes.get(tempDominoes.size() - 1).getRightSide()) {
                    tempDominoes.add(domino);
                    dominoes.remove(domino);
                }
            }
        } while (tempDominoes.size() != initDominoes.size());

        dominoes = tempDominoes;

        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}