import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PokerTDDTest {

    PokerTDD pokerTDD;
    ArrayList<String> whiteList = new ArrayList<>();
    ArrayList<String> blackList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        pokerTDD = new PokerTDD();
        whiteList.add("2C");
        whiteList.add("3D");
        whiteList.add("4C");
        whiteList.add("5C");
        whiteList.add("6H");

        blackList.add("2H");
        blackList.add("2S");
        blackList.add("5S");
        blackList.add("AC");
        blackList.add("AD");
    }

    @Test
    public void test1() {
        assertEquals("white wins", pokerTDD.selectWinner(whiteList, blackList));
    }

    @After
    public void tearDown() throws Exception {
    }

}