package helpers.gitApiHelper;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class GitHubApiHelper {
    public void createNewRepo(String URL, String requestUrl, String token, String newRepoName,String description) {
        String createNewRepoBody =
                "{\n" +
                        "  \"name\": \""+ newRepoName +"\",\n" +
                        "  \"description\": \""+ description +"\",\n" +
                        "  \"homepage\": \"https://github.com\",\n" +
                        "  \"private\": false,\n" +
                        "  \"has_issues\": true,\n" +
                        "  \"has_projects\": true,\n" +
                        "  \"has_wiki\": true\n" +
                        "}";

        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(createNewRepoBody)
                .when()
                .post(URL + requestUrl)
                .then()
                .log().all()
                .statusCode(201);
    }

    public void getRepo(String baseUrl, String requestUrl, String token) {
        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(baseUrl + requestUrl)
                .then().log().all().statusCode(200);
    }

    public void deleteRepo(String baseUrl, String requestUrl, String repoName, String token) {
        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .delete(baseUrl + requestUrl + repoName)
                .then().log().all().statusCode(204);
    }

    public void updateRepo(String baseUrl, String requestUrl, String repoName, String newRepoName, String token) {
        String updateRepoBody = "{\n" +
                "  \"name\": \"" + newRepoName + "\"\n" +
                "  }";
        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(updateRepoBody)
                .when()
                .patch(baseUrl + requestUrl + repoName)
                .then()
                .log().all()
                .statusCode(200);
    }

}
