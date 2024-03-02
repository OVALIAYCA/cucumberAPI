package stepdefinitions;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class JsonPH_StepDefinitions {

    String endPoint;
    JsonPath resJpath;
    JsonObject reqBody;
    Response response;



    @Given("kullanici {string} base Url adresine gider")
    public void kullanici_base_url_adresine_gider(String baseUrl) {


        endPoint = ConfigReader.getProperty(baseUrl);

    }
    @Then("kullanici {string} parametlerini kullanir")
    public void kullanici_parametlerini_kullanir(String string) {


    }
    @Then("kullanici GET request gonderip gelen response kaydeder")
    public void kullanici_get_request_gonderip_gelen_response_kaydeder() {


    }
    @Then("kullanici status kodunun {int} oldugunu test eder")
    public void kullanici_status_kodunun_oldugunu_test_eder(Integer int1) {


    }
    @Then("kullanici content type degerinin {string} oldugunu test eder")
    public void kullanici_content_type_degerinin_oldugunu_test_eder(String string) {


    }
    @Then("kullanici donen cevapta userId degerinin {int} oldugunu test eder")
    public void kullanici_donen_cevapta_user_id_degerinin_oldugunu_test_eder(Integer int1) {


    }
    @Then("kullanici donen cevapta title degerinin {string} oldugunu test eder")
    public void kullanici_donen_cevapta_title_degerinin_oldugunu_test_eder(String string) {


    }


}
