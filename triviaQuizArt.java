import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class triviaQuizArt {
    public static void getTriviaQuestions(String triviaURL) throws Exception{

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(triviaURL)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200){
            System.out.println("Trivia data received:\n" + response.body());
        } else {
            System.out.println("Data not received. Status code: " + response.statusCode());
        }
    }

      // builds the url based on the user's preferences
    /**
     * @param numberOfQuestions
     * @param difficulty
     * @return
     */
    public static String buildURL(int numberOfQuestions, String difficulty) {
        //body
        return "";
    }

    // Presents questions to the user and tracks correct answers
    /**
     * @return
     */
    public static int playQuiz() {
        // body
        return 0;
    }

    // Calculates and displays the user's final score
    /**
     * @param score
     * @param totalQuestions
     */
    public static void displayScore(int score, int totalQuestions) {
        // body will determine pass or fail with 70% of q's right meaning pass 
    }    

    public static void main(String[] args) throws Exception {
        String triviaURL = "https://opentdb.com/api.php?amount=10&category=25&difficulty=easy&type=multiple&encode=url3986";

        getTriviaQuestions(triviaURL);
    }






}    

