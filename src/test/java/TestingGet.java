import FachadaURL.FachadaURL;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestingGet {


    private static final Logger LOGGER = LogManager.getLogger(TestingGet.class);


    @Test
    public void getAlternativeTitles(){
        FachadaURL fachadaURL = new FachadaURL("https://api.themoviedb.org/3", "","movie","619297-sweet-girl","alternative_titles","2e172e18c00b19621224226c2fff60f9");

        LOGGER.error("Empezo a correr el test getAlternativeTitles");
        String url = fachadaURL.construirURLFach();

        given().when().get(url).then().statusCode(200);
        LOGGER.info("Termino de correr el test getAlternativeTitles");
    }
    
    @Test
    public void getCreditsTV(){
        FachadaURL fachadaURL = new FachadaURL("https://api.themoviedb.org/3", "","tv","91363-what-if","credits","2e172e18c00b19621224226c2fff60f9");

        LOGGER.info("Empezo a correr el test getCreditsTV");
        String url = fachadaURL.construirURLFach();

        given().when().get(url).then().statusCode(200);
        LOGGER.info("Termino de correr el test getCreditsTV");
    }

    @Test
    public void getEpisodeGroupsTV(){
        FachadaURL fachadaURL = new FachadaURL("https://api.themoviedb.org/3", "","tv","91363-what-if","episode_groups","2e172e18c00b19621224226c2fff60f9");

        LOGGER.info("Empezo a correr el test getEpisodeGroupsTV");
        String url = fachadaURL.construirURLFach();

        given().when().get(url).then().statusCode(200);
        LOGGER.info("Termino de correr el test getEpisodeGroupsTV");
    }


}
