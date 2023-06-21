package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void stringWithBalancedBrackets() {
    String spec = "Tests a string that contains balanced brackets";
    String expected = "[LaunchCode]";
    assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test
    public void stringWithBalanceBracketsAndNonBracketChars() {
        String spec = "Tests a string that contains balanced brackets with non-bracket characters";
        String expected = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test
    public void stringThatStartsWithBrackets(){
        String spec = "Tests a string that starts and ends with brackets.";
        String expected = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }




}
