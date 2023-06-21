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
    public void emptyTest() { //2
        assertEquals(true, true);
    }

    @Test //3
    public void stringWithBalancedBrackets() {
    String spec = "Tests a string that contains balanced brackets";
    String expected = "[LaunchCode]";
    assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //4
    public void stringWithBalanceBracketsAndNonBracketChars() {
        String spec = "Tests a string that contains balanced brackets with non-bracket characters";
        String expected = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //5
    public void stringThatStartsWithBrackets(){
        String spec = "Tests a string that starts and ends with brackets.";
        String expected = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //6
    public void emptyStringTest() {
        String spec = "Tests empty string";
        String expected = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //7
    public void stringWithUnbalancedBrackets() {
        String spec = "Tests a string that contains unbalanced brackets";
        String expected = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //8
    public void stringWithMisNestedBrackets() {
        String spec = "Tests a string that contains mis-nested brackets";
        String expected = "Launch]Co[de"; // String with mis-nested brackets
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //9
    public void stringWithOnlyOneOpenBracket() {
        String spec = "Tests a string that contains only an opening bracket";
        String expected = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //10
    public void stringWithOnlyOneCloseBracket(){
        String spec = "Tests a string that contains only one closed bracket";
        String expected = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //11
    public void stringWithOnlyTwoBrackets() {
        String spec = "Tests a string that contains only two brackets";
        String expected = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(expected));
    }

    @Test //12
    public void stringWithBalancedBracketsAndNonBracketChars() {
        String spec = "Tests a string that contains both balanced brackets and non-bracket characters";
        String expected = "Launch[Code][rocks]!";
        assertTrue(BalancedBrackets.hasBalancedBrackets(expected));
    }
}
