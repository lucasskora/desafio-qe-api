package qe.sicredi.api;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsNull.notNullValue;

public class PostProductAddTest {

    @Test
    public void testAddProduct() {
        RestAssured.baseURI = "https://dummyjson.com";

        Faker faker = new Faker();

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", faker.commerce().productName());
        requestBody.put("description", faker.lorem().sentence());
        requestBody.put("price", faker.number().randomDouble(2, 1, 100));
        requestBody.put("discountPercentage", faker.number().randomDouble(1, 0, 50));
        requestBody.put("rating", faker.number().randomDouble(2, 0, 5));
        requestBody.put("stock", faker.number().numberBetween(1, 100));
        requestBody.put("brand", faker.company().name());
        requestBody.put("category", faker.commerce().department());
        requestBody.put("thumbnail", faker.internet().image());

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/products/add")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
        response.then().body("id", notNullValue());

    }
}