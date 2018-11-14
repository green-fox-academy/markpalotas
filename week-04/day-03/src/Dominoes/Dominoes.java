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
        List<Domino> tempDominoesList = new ArrayList<Domino>();
        Domino nullDomino = new Domino(0, 0);
        Domino[] tempDominoesArray = initDominoes.toArray(new Domino[initDominoes.size()]);

        do {
            tempDominoesList.clear();
            int firstDomino = (int) (Math.random() * (5 + 1));
            tempDominoesList.add(tempDominoesArray[firstDomino]);
            tempDominoesArray[firstDomino] = nullDomino;
            int counter;
            do {
                counter = 0;
//                the last step (setting the current domino to nullDomino) does not seem to work in the below FOREACH loop
//
//                for (Domino domino : tempDominoesArray) {
//                    if (domino.getRightSide() != 0 && domino.getLeftSide() == tempDominoesList.get(tempDominoesList.size() - 1).getRightSide()) {
//                        tempDominoesList.add(domino);
//                        domino = nullDomino;
                for (int i = 0; i < tempDominoesArray.length; i++) {
                    if (tempDominoesArray[i].getRightSide() != 0 && tempDominoesArray[i].getLeftSide() == tempDominoesList.get(tempDominoesList.size() - 1).getRightSide()) {
                        tempDominoesList.add(tempDominoesArray[i]);
                        tempDominoesArray[i] = nullDomino;
                    } else counter++;
                }
            } while (counter < 6);

        } while (tempDominoesList.size() != initDominoes.size());

        dominoes = tempDominoesList;

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