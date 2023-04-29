package com.restfulbooker.test.crud;

import com.restfulbooker.endpoints.APIConstant;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequestTest {


    @Test
    public void getTest(){
        RequestSpecification r = RestAssured.given(); // Pre script
        r.baseUri(APIConstant.BASE_URL);
        r.basePath(APIConstant.CREATE_GET_POST_URL_BOOKING);
        r.when().get();
        r.then().statusCode(200);

    }
}
