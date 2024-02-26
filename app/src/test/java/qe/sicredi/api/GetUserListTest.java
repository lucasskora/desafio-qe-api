package qe.sicredi.api;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.*;
public class GetUserListTest {
    @Test
    public void testGetUserList() {
        when()
                .get("https://dummyjson.com/users")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("users", not(empty()))
                .body("users.id", everyItem(isA(Integer.class)))
                .body("users.firstName", everyItem(isA(String.class)))
                .body("users.lastName", everyItem(isA(String.class)))
                .body("users.maidenName", everyItem(isA(String.class)))
                .body("users.age", everyItem(isA(Number.class)))
                .body("users.gender", everyItem(isA(String.class)))
                .body("users.email", everyItem(isA(String.class)))
                .body("users.phone", everyItem(isA(String.class)))
                .body("users.username", everyItem(isA(String.class)))
                .body("users.password", everyItem(isA(String.class)))
                .body("users.birthDate", everyItem(isA(String.class)))
                .body("users.image", everyItem(isA(String.class)))
                .body("users.bloodGroup", everyItem(isA(String.class)))
                .body("users.height", everyItem(isA(Number.class)))
                .body("users.weight", everyItem(isA(Number.class)))
                .body("users.eyeColor", everyItem(isA(String.class)))
                .body("users.hair.color", everyItem(isA(String.class)))
                .body("users.hair.type", everyItem(isA(String.class)))
                .body("users.domain", everyItem(isA(String.class)))
                .body("users.ip", everyItem(isA(String.class)))
                .body("users.address.address", everyItem(isA(String.class)))
                .body("users.address.city", everyItem(isA(String.class)))
                .body("users.address.coordinates.lat", everyItem(isA(Float.class)))
                .body("users.address.coordinates.lng", everyItem(isA(Float.class)))
                .body("users.address.postalCode", everyItem(isA(String.class)))
                .body("users.address.state", everyItem(isA(String.class)))
                .body("users.macAddress", everyItem(isA(String.class)))
                .body("users.university", everyItem(isA(String.class)))
                .body("users.bank.cardExpire", everyItem(isA(String.class)))
                .body("users.bank.cardNumber", everyItem(isA(String.class)))
                .body("users.bank.cardType", everyItem(isA(String.class)))
                .body("users.bank.currency", everyItem(isA(String.class)))
                .body("users.bank.iban", everyItem(isA(String.class)))
                .body("users.company.address.address", everyItem(isA(String.class)))
                .body("users.company.address.city", everyItem(anyOf(isA(String.class), nullValue())))
                .body("users.company.address.coordinates.lat", everyItem(isA(Float.class)))
                .body("users.company.address.coordinates.lng", everyItem(isA(Float.class)))
                .body("users.company.address.postalCode", everyItem(isA(String.class)))
                .body("users.company.address.state", everyItem(isA(String.class)))
                .body("users.company.name", everyItem(isA(String.class)))
                .body("users.job.company", everyItem(isA(String.class)))
                .body("users.job.position", everyItem(isA(String.class)))
                .body("users.socialMedia.facebook", everyItem(isA(String.class)))
                .body("users.socialMedia.instagram", everyItem(isA(String.class)))
                .body("users.socialMedia.twitter", everyItem(isA(String.class)))
                .body("users.socialMedia.youtube", everyItem(isA(String.class)))
                .body("users.wallet", everyItem(anyOf(isA(String.class), nullValue())))
                .body("users.crypto.network", everyItem(isA(String.class)))
                .body("total", equalTo(100))
                .body("skip", equalTo(0))
                .body("limit", equalTo(30));
    }
}