package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import qe.sicredi.api.GetProductByIdTest;

public class GetProductsByIdRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(GetProductByIdTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test successful: " + result.wasSuccessful());
    }
}