package Test_Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList myTestArrayList;

    @BeforeEach
    public void resetArrayList() {
        myTestArrayList = new MyArrayList();
    }

    @Test
    void testSumWithPositives() {
        ArrayList<Integer> testListToSum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer a = 15;
        assertEquals(myTestArrayList.sum(testListToSum), a);
    }

    @Test
    void testSumWithNegatives() {
        ArrayList<Integer> testListToSum = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        assertEquals(myTestArrayList.sum(testListToSum), new Integer(-15));
    }

    @Test
    void testSumWithZeros() {
        ArrayList<Integer> testListToSum = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        assertEquals(myTestArrayList.sum(testListToSum), new Integer(0));
    }

    @Test
    void testSumWithEmpty() {
        ArrayList<Integer> testListToSum = new ArrayList<>();
        assertNull(myTestArrayList.sum(testListToSum));
    }
}