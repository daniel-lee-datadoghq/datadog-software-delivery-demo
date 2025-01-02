/*
 * This source file was generated by the Gradle 'init' task
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
