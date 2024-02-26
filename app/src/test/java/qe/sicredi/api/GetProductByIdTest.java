package qe.sicredi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.isA;

public class GetProductByIdTest {
    @Test
    public void testGetProductById() {

        RestAssured.baseURI = "https://dummyjson.com";

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/products/1")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("id", isA(Integer.class))
                .body("title", isA(String.class))
                .body("description", isA(String.class))
                .body("price", isA(Integer.class))
                .body("discountPercentage", isA(Float.class))
                .body("rating", isA(Float.class))
                .body("stock", isA(Integer.class))
                .body("brand", isA(String.class))
                .body("category", isA(String.class))
                .body("thumbnail", isA(String.class))
                .body("images", isA(List.class));
    }
    @Test
    public void testGetNotFoundProduct() {

        RestAssured.baseURI = "https://dummyjson.com";

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/products/0")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_NOT_FOUND)
                .body("message", equalTo("Product with id '0' not found"));
    }
}