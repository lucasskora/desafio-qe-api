package qe.sicredi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthenticationTest {

    @Test
    public void testAuthenticateToken() {
        String username = "kminchelle";
        String password = "0lelplR";

        Map<String, String> authenticationBody = new HashMap<>();
        authenticationBody.put("username", username);
        authenticationBody.put("password", password);

        RestAssured.baseURI = "https://dummyjson.com";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(authenticationBody)
                .when()
                .post("/auth/login")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        response.then().body("token", notNullValue());

        // Extract token from response and use it for the next request
        String token = response.path("token");
        testGenerateToken(token);
    }

    private void testGenerateToken(String token) {
        RestAssured.baseURI = "https://dummyjson.com";

        Response response = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .when()
                .get("/auth/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        response.then().body("products", notNullValue());
    }

}