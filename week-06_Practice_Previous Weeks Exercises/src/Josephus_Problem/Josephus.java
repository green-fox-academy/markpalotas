package Josephus_Problem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        tellSolution(findSurvivor(howManyRebels()));
    }

    public static int howManyRebels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Out of how many rebels do you want to be the only survivor?");
        int howManyRebels = scanner.nextInt();
        return howManyRebels;
    }

    public static void tellSolution(Integer winningPosition) {
        System.out.println("Dear friend, you may want to occupy position nr. " + winningPosition + ", nr. 1 being the position of the first rebel to strike.");
    }

    public static Integer findSurvivor(int howManyRebels) {
        List<Integer> rebelList = new ArrayList<>();
        for (int i = 0; i < howManyRebels; i++) {
            rebelList.add(i + 1);
        }
        while (rebelList.size() > 1) {
            if (rebelList.size() % 2 == 0) {
                rebelList = removeEverySecondElement(rebelList);
            } else {
                rebelList = removeEverySecondElement(rebelList);
                rebelList.remove(0);
            }
        }
        return rebelList.get(0);
    }

    public static List<Integer> removeEverySecondElement(List<Integer> listToReduce) {
        for (int i = 1; i < listToReduce.size(); i++) {
            /* i++ and not i+=2 because the indices keep changing as elements are being removed */
            /* i.e. element(2) becomes element(1) once the original element(1) is removed */
            listToReduce.remove(i);
        }
        return listToReduce;
    }
}
