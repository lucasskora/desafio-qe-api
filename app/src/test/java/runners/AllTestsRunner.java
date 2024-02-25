package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import qe.sicredi.api.AuthenticationTest;
import qe.sicredi.api.GetTest;
import qe.sicredi.api.GetUserListTest;

public class AllTestsRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                GetTest.class,
                AuthenticationTest.class,
                GetUserListTest.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test successful: " + result.wasSuccessful());
    }
}