package ApiTesting;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponseOptions;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Api {
    //Use any 2 methods(Get, and Delete) from end-points listed in
    //http://dummy.restapiexample.com/
    //	2. Perform assertions for
    //	   - Get & Delete - Status code to be Successful.
    //	   - Get - Return specific Employee details(Any).
    //	   - Delete - "message": "successfully! deleted Records".


    @Test
    public void getMethod() {
        Response response= given().
                when().
                get("http://dummy.restapiexample.com/api/v1/employees");
        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(200);

        JsonPath jsonpath=response.jsonPath();
        System.out.println( jsonpath.getString("employee_name"));
        System.out.println(jsonpath.getString("data[1].employee_name"));
    }
    @Test
    public void deleteMethod() {
        int id = 1;
        Response responseBeforeDelete=given().
                when().
                get("http://dummy.restapiexample.com");

        responseBeforeDelete.prettyPrint();

        Response responseAfterDelete=given().
                when().
                delete().path("id","api/v1/delete/" +id);

        responseAfterDelete.prettyPrint();


        Response getResponseAfterDelete=given().

                when().
                get("http://dummy.restapiexample.com/api/v1/delete/1");
        getResponseAfterDelete.prettyPrint();

        getResponseAfterDelete.
                then().
                assertThat().
                statusCode(200);

    }


}


