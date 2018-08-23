import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumMainTest {
    SumMain sm1;
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    SumMain sumMain = new SumMain();

    //@Before


    @Test
    public void sumList() {
        assertEquals(15, sumMain.sumList(list));
    }
}