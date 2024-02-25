package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import qe.sicredi.api.PostProductAddTest;

public class PostProductAddRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PostProductAddTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test successful: " + result.wasSuccessful());
    }
}