package Test_Apples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple testApple;

    @BeforeEach
    public void resetTestApple() {
        testApple = new Apple();
    }

    @Test
    public void testGetApple() {
        assertEquals(testApple.getApple(), "Apple");
    }
}