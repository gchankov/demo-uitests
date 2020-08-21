package utils;

import java.util.HashMap;
import java.util.Map;

public class TestData {

    private static Map<String, String> testData = null;

    private TestData() {}

    public static Map<String, String> current() {
        if (testData == null) {
            testData = new HashMap<String, String>();
        }

        return testData;
    }

    public static void reset() {
        testData = new HashMap<String, String>();
    }
}
