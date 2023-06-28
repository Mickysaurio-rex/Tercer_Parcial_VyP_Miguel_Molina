package restAPI.apiTest;

import restAPI.factoryRequest.FactoryRequest;
import restAPI.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import restAPI.utils.Properties;

import java.util.Base64;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserToken {
    RequestInfo basicAuthRequestInfo = new RequestInfo();
    RequestInfo requestInfo = new RequestInfo();
    RequestInfo requestInfoToken = new RequestInfo();
    Response response;
    JSONObject bodyUser = new JSONObject();
    JSONObject bodyUserUpdate = new JSONObject();
    JSONObject bodyUserUpdate2 = new JSONObject();
    String auth;
    String token;
    @BeforeEach
    public void setup() {
        bodyUser.put("FullName", "Miguel Molina");
        bodyUser.put("Email", "MiguelV"+new Date().getTime() +"@upb.com");
        bodyUser.put("Password", "12345");
        bodyUserUpdate.put("FullName", "Miguel Molina Verificacion");
        bodyUserUpdate2.put("FullName", "Miguel Molina Verificacion2");
    }
    @Test
    public void verifyUserProjectTest() {
        requestInfo.setHost(Properties.host + "api/user.json").setBody(bodyUser.toString());
        response = FactoryRequest.make("post").send(requestInfo);
        response.then().log().all().statusCode(200)
                .body("Email", equalTo(bodyUser.get("Email")))
                .body("FullName", equalTo(bodyUser.get("FullName")));

        auth = Base64.getEncoder().encodeToString((bodyUser.get("Email")+":"+bodyUser.get("Password")).getBytes());
        basicAuthRequestInfo.setHost(Properties.host + "api/authentication/token.json").setHeader("Authorization", "Basic " + auth);
                response = FactoryRequest.make("get").send(basicAuthRequestInfo);
                response.then()
                        .log().all()
                        .statusCode(200)
                        .body("UserEmail", equalTo(bodyUser.get("Email")));
                token = response.then().extract().path("TokenString");

        requestInfo.setHost(Properties.host + "api/user/0.json").setBody(bodyUserUpdate.toString()).setHeader("Token", token);
                response = FactoryRequest.make("post").send(requestInfo);
                response.then()
                    .log().all()
                    .statusCode(200)
                    .body("FullName", equalTo(bodyUserUpdate.get("FullName")));

        requestInfoToken.setHost(Properties.host + "api/authentication/token.json").setHeader("Token", token);
                response = FactoryRequest.make("delete").send(requestInfoToken);
                response.then()
                        .log().all()
                        .statusCode(200)
                        .body("UserEmail", equalTo(bodyUser.get("Email")));

        requestInfo.setHost(Properties.host + "api/user/0.json").setBody(bodyUserUpdate2.toString()).setHeader("Token", token);
                response = FactoryRequest.make("post").send(requestInfo);
                response.then()
                        .log().all()
                        .statusCode(200)
                        .body("ErrorMessage", equalTo("Not Authenticated"))
                        .body("ErrorCode", equalTo(102));

        basicAuthRequestInfo.setHost(Properties.host + "api/user/0.json").setHeader("Authorization", "Basic " + auth);
                response = FactoryRequest.make("delete").send(basicAuthRequestInfo);
                response.then()
                        .log().all()
                        .statusCode(200)
                        .body("Email", equalTo(bodyUser.get("Email")));




        }



}
