package org.example;

public class main {
    public static void main(String[] args) {
        executeCustomRequest();
    }

    public static void executeCustomRequest() {
        RequestSpecification customRequestSpec = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .setContentType(ContentType.JSON)
                .build();

        RestAssured.requestSpecification = customRequestSpec;

        RestAssured
                .get("users/2")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("email", Matchers.equalTo("Shanna@melissa.tv"));
    }
}
