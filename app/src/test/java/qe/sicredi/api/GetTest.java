package qe.sicredi.api;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class GetTest {

    @Test
    public void testGet(){
        when()
                .get("https://dummyjson.com/test")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("status", equalTo("ok"))
                .body("method", equalTo("GET"));
    }
}