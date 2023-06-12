package com.qacart.todo.testcases;

import org.junit.Test;
import static io.restassured.RestAssured.given;


public class UserTest {

    @Test
    public void shouldBeAbleToRegister(){
            String body ="{\n" +
                    "\"email\": \"test11@test.com\",\n" +
                    "\"firstName\": \"moh\",\n" +
                    "\"lastName\": \"test\",\n" +
                    "\"password\": \"123456789\"\n" +
                    "}";
            given().

    }
}
