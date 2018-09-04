import org.junit.Test;

import static org.junit.Assert.*;


public class AnagramTest {
    @Test
    public void charCounterTest() {
        assertFalse(Anagram.IsAnagram("majom", "dfvdgdfgd"));
    }

    @Test
    public void charCounterTest2() {
        assertTrue(Anagram.IsAnagram("majom", "majom"));
    }

    @Test
    public void charCounterTest3() {
        assertTrue(Anagram.IsAnagram("majom", "mojam"));
    }

    @Test
    public void charCounterTest4() {
        assertTrue(Anagram.IsAnagram("ma12jom", "moJa12m"));
    }
}