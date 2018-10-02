package com.greenfox.workshop.models;

import com.greenfox.workshop.controllers.Controller;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendTest {
    @Test

    public void testAppend() {

        Controller controller = new Controller();
        Append append = controller.appendFunction("kuty");
        assertEquals("kutya", append.getAppended());
    }

    @Test
    public void Doubling() {
        Controller controller = new Controller();
        Doubling doubling = controller.doubleNumber("15");
        assertEquals(30, doubling.getResult());
    }

    @Test
    public void greetingTest() {
        Controller controller = new Controller();
        Greeting greeting = controller.greetingFunction("", "");
        assertEquals("Please provide an input!", greeting.getError());
    }
}