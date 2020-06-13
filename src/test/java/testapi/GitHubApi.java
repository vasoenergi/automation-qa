package testapi;

import helpers.gitApiHelper.GitHubApiHelper;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

    public class GitHubApi {
        private static final String TOKEN = "e89497230286d348f705bce96d659c14a5314a33";
        private static final String URL = "https://api.github.com/";

        public static void main(String[] args) {
            GitHubApiHelper gitHubApiHelper = new GitHubApiHelper();
            //gitHubApiHelper.createNewRepo(URL, "user/repos", TOKEN, "TestGithubApi", "Vasily repos");
            //gitHubApiHelper.getRepo(URL, "user/repos", TOKEN);
            gitHubApiHelper.deleteRepo(URL, "repos/vasoenergi/", "TestApi", TOKEN);
            //gitHubApiHelper.updateRepo(URL, "repos/vasoenergi/", "TestApi2", "TestApi", TOKEN);

        }
    }


