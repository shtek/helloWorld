package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DummyTest {

    @Test
    public void dosomething() {
        Dummy d = new Dummy();

        Assert.assertEquals("a",d.dosomething());

    }
}