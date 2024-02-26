package qe.sicredi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.isA;

public class GetProductsListTest {

    @Test
    public void testGetProducts() {
        RestAssured.baseURI = "https://dummyjson.com";

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("products[0].id", isA(Integer.class))
                .body("products[0].title", isA(String.class))
                .body("products[0].description", isA(String.class))
                .body("products[0].price", isA(Integer.class))
                .body("products[0].discountPercentage", isA(Float.class))
                .body("products[0].rating", isA(Float.class))
                .body("products[0].stock", isA(Integer.class))
                .body("products[0].brand", isA(String.class))
                .body("products[0].category", isA(String.class))
                .body("products[0].thumbnail", isA(String.class))
                .body("products[0].images", isA(Object.class))
                .body("total", equalTo(100))
                .body("skip", equalTo(0))
                .body("limit", equalTo(30));
    }
}