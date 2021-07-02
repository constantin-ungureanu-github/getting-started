package org.acme.getting.started;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class GreetingResourceTest {

  @Test
  void testHelloEndpoint() {
    given().when().get("/hello").then().statusCode(200).body(is("Hello RESTEasy"));
  }

  @Test
  void testHelloEndpoint2() {
    given().when().get("/hello").then().statusCode(200).body(is("Hello RESTEasy"));
  }
}
