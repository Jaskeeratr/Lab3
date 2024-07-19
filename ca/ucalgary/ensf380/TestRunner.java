package ca.ucalgary.ensf380;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(BooksTest.class)
public class TestRunner {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ca.ucalgary.ensf380.BooksTest");
    }
}
