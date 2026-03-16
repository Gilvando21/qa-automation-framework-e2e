
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ContractTest {

    @Test
    public void validateContract() {

        RestAssured
            .given()
            .when()
            .get("https://reqres.in/api/users/2")
            .then()
            .statusCode(200);

    }
}
