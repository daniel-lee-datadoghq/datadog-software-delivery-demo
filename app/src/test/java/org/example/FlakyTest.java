/*
 * src/test/java/demo/FlakyTest.java
 * This source file was created to simulate flaky test
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;

class FlakyTest {
    
    SecureRandom rand = new SecureRandom();
    
    @Test void roll_the_dice() throws Exception {
        assertTrue(rand.nextBoolean());
    }
}
