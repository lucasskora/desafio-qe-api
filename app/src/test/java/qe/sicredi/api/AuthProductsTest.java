package qe.sicredi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class AuthProductsTest {

    public String getToken() {
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

        return response.path("token");
    }

    @Test
    @DisplayName("Teste Integrado para Gerar Token e Buscar Produtos com Autenticação")
    public void testSearchProductToken() {
        String token = getToken();

        RestAssured.baseURI = "https://dummyjson.com";

        Response responseProducts = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .when()
                .get("/auth/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        responseProducts.then().body("products", notNullValue());
    }

    @Test
    @DisplayName("Status 403 Forbidden ao não passar o header 'Authorization'")
    public void testForbidden() {
        RestAssured.baseURI = "https://dummyjson.com";

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/auth/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_FORBIDDEN)
                .extract()
                .response();

        response.then().body("message", equalTo("Authentication Problem"));
    }

    @Test
    @DisplayName("Status 401 Unauthorized ao passar um Token expirado")
    public void testUnauthorized() {
        RestAssured.baseURI = "https://dummyjson.com";

        Response response = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + "testeTokenExpired")
                .when()
                .get("/auth/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_UNAUTHORIZED)
                .extract()
                .response();

        response.then().body("name", equalTo("JsonWebTokenError"));
        response.then().body("message", equalTo("Invalid/Expired Token!"));
    }
}