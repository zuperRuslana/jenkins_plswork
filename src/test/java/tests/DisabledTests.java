package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DisabledTests {
    @Test
    @Disabled
    void test1(){
        assertTrue(false);
    }
    @Test
    @Disabled("test sucks")
    void test2(){
        assertTrue(false);
    }
}
