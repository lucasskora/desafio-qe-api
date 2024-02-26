package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import qe.sicredi.api.AuthProductsTest;

public class AuthRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AuthProductsTest.class);

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully!");
        } else {
            System.out.println("Tests failed:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}