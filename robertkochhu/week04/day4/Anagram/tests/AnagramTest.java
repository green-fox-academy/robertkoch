import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    String name = "majom";
    String nameOne = "mojam";

    @Test


    public void anagram() {
        Anagram anagram1 = new Anagram();
        assertTrue(anagram1.anagram(name, nameOne) == true);
    }
}