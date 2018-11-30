package Test_Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @org.junit.jupiter.api.Test
    void testZero() {
        assertEquals(Fibonacci.fibo(0), 0);
    }

    @org.junit.jupiter.api.Test
    void testOne() {
        assertEquals(Fibonacci.fibo(1), 1);
    }

    @org.junit.jupiter.api.Test
    void testTwo() {
        assertEquals(Fibonacci.fibo(2), 1);
    }

    @org.junit.jupiter.api.Test
    void testThree() {
        assertEquals(Fibonacci.fibo(3), 2);
    }

    @org.junit.jupiter.api.Test
    void testLargerInt() {
        assertEquals(Fibonacci.fibo(9), 34);
    }
}