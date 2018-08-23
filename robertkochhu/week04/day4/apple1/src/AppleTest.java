import static org.junit.Assert.*;

public class AppleTest {
    Apple apple2;
    @org.junit.Before
    public void setUp() throws Exception {
        apple2 = new Apple();

    }

    @org.junit.Test
    public void getApple() {
        assertEquals("apple",apple2.getApple());
    }
}