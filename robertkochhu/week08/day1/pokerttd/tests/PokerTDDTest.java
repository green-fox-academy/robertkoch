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
        whiteList.add("JC");
        whiteList.add("JD");
        whiteList.add("KC");
        whiteList.add("Ks");
        whiteList.add("KH");

        blackList.add("QH");
        blackList.add("QS");
        blackList.add("AS");
        blackList.add("AC");
        blackList.add("AD");
    }

    @Test
    public void test1() {
        assertEquals("black wins", pokerTDD.selectWinner(whiteList, blackList));
    }

    @After
    public void tearDown() throws Exception {
    }

}