import java.util.*;
public class Question {

    /*
     * The text of the question
     * The multiple-choice options for the question
     * The correct answer for the question
     */

    private String question;
    private String[] options;
    private String answer;

    // Constructor to initialize a Question object with the question text, options, and correct answer
    public Question(String question, String[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;

        // Shuffle the options to randomize their order
        List<String> optionList = Arrays.asList(this.options);

        // Randomize the order of options
        // Convert the shuffled list back to an array
        Collections.shuffle(optionList);
        this.options = optionList.toArray(new String[0]);
    }

    // Method to get the question text
    public String getQuestion() {
        return question;
    }

    // Method to get the mcq options
    public String[] getOptions() {
        return options;
    }

    // Method to get the correct answer
    public String getAnswer() {
        return answer;
    }

    // Method to check if a given option is the correct answer
    public boolean checkCorrect(String selected_option) {
        return answer.equals(selected_option);
    }
}
