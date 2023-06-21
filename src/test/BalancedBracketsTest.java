package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() { //1
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //2
    public void stringWithBalancedBrackets() {
    String spec = "Tests a string that contains balanced brackets";
    String expected = "[LaunchCode]";
    assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //3
    public void stringWithBalanceBracketsAndNonBracketChars() {
        String spec = "Tests a string that contains balanced brackets with non-bracket characters";
        String expected = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //4
    public void stringThatStartsWithBrackets(){
        String spec = "Tests a string that starts and ends with brackets.";
        String expected = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //5
    public void emptyStringTest() {
        String spec = "Tests empty string";
        String expected = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //6
    public void stringWithUnbalancedBrackets() {
        String spec = "Tests a string that contains unbalanced brackets";
        String expected = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

}
