import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {

    private static Logger LOGGER = Logger.getLogger(Test1.class);

    @Test
    public void test1(){

        Response response = RestAssured.get("https://api.themoviedb.org/3/movie/550?api_key=2e172e18c00b19621224226c2fff60f9");

        System.out.println(response.getBody().asString());


        Assert.assertEquals(response.getStatusCode(), 200);


    }

    @Test
    public void test2(){
        given().get("https://api.themoviedb.org/3/movie/550?api_key=2e172e18c00b19621224226c2fff60f9").then().statusCode(200);
    }
}
