import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmenBodyQuery {

    @Test
    public void ShouldTestBody() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Body")
                .contentType("text/plain; charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .statusCode(300)
                .body("data", equalTo ("Body"))
        ;
    }
}

