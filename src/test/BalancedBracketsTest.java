package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class = new BalancedBrackets();
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }

    @Test
    public void rightBracketOnlyReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void leftBracketOnlyReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test
    public void rightBracketWithCharReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]wrong"));
    }

    @Test
    public void rightBracketWithLeftAfterReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void rightBracketWithCharAndLeftReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]wrong["));
    }

    @Test
    public void twoSetsOfBracketsWithRightFirstReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("][]["));
    }

    @Test
    public void rightBracketTwiceReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]]"));
    }

    @Test
    public void rightBracketTwiceWithLeftReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]][]"));
    }

    @Test
    public void twoLeftBracketsReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[["));
    }

    @Test
    public void leftLeftRightBracketsReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[[]"));
    }

    @Test
    public void bracketsWithStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[string]"));
    }

    @Test
    public void bracketsBeforeStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]string"));
    }

    @Test
    public void bracketsAfterStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("string[]"));
    }

    @Test
    public void bracketsMakingSubstringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("st[ring]"));
    }

    @Test
    public void embeddedBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[[]][ring]"));
    }
}
