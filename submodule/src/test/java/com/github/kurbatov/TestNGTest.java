package com.github.kurbatov;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNGTest  {

    @Test(groups = {"foo"})
    public void firstTest() {
        System.out.println("First test");
    }

    @Test(dependsOnGroups = {"foo"})
    public void dependentTest() {
        System.out.println("Testing");
        assertTrue(true);
    }
}
