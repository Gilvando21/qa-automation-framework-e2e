import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ContractTest {

    @Test
    public void validateContract() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
        .when()
        .get("/posts/1")
        .then()
        .statusCode(200)
        .body("id", equalTo(1));

    }
}