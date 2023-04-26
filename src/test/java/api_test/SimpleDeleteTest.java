package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDeleteTest extends BaseAPIClass {

    @Test
    public void deleteSingleUser(){
        LOGGER.info("------- API Test: Get Single User with Path Variables --------");

        // Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        // Get the requestSpecification of the request that you want to send to the server.
        // The server is specified in the baseURI that we have specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the HTTP Method Type.
        // This will return the response from the server. Store the response in a variable.
        String id = "2";
        Response response = httpRequest.request(Method.DELETE, id);

        // Assert that the correct response status code is returned.
        Assert.assertEquals(response.getStatusCode(), 204);


        LOGGER.info("------- End Test: Delete Single User -------");

    }
}
