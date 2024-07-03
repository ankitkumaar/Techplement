import java.util.*;
public class Quiz {

    /*
     * The title of the quiz
     * The list of questions in the quiz
     */

    private String quiz_name;
    private List<Question> questions;

    // Constructor to initialize the Quiz with a title
    public Quiz(String quiz_name) {
        this.quiz_name = quiz_name;
        this.questions = new ArrayList<>();
    }

    // Method to add a question to the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Method to take the quiz and interact with the user
    public void takeQuiz() {
        // Scanner for user input
        // Variable to keep track of the user's score
        Scanner in = new Scanner(System.in);
        int score = 0;

        // Print each option with a corresponding number
        for (Question question : questions) {

            System.out.println(question.getQuestion());
            String[] options = question.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            // Prompt the user to enter their choice
            System.out.print("Enter your choice (1-" + options.length + "): ");
            int choice = in.nextInt() - 1;

            if (choice >= 0 && choice < options.length && question.checkCorrect(options[choice])) {
                System.out.println("Correct Answer!");
                // Increment the score
                score++;
            } else {
                System.out.println("Wrong Answer! The correct answer is: " + question.getAnswer());
            }

            System.out.println();
        }

        // Print the user's final score
        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
        System.out.println();
    }

    // Method to get the title of the quiz
    public String getTitle() {
        return quiz_name;
    }
}
