import java.nio.file.*;
import java.util.*;

public class Main {
    // ArrayList to store the questions read from the file
    private static ArrayList<Question> questions = new ArrayList<Question>();

    // Method to read questions from the data.txt file
    private static void read() {
        try {
            // Define the path to the file
            Path path = Paths.get("data.txt");
            System.out.println("Attempting to read file from path: " + path.toAbsolutePath());

            // Read all lines from the file
            List<String> lines = Files.readAllLines(path);
            System.out.println("File read successfully. Number of lines: " + lines.size());
            System.out.println();

            // Iterate over the lines in chunks of 6 (assuming each question has 1 text + 5 optio
            for (int i=0; i<lines.size(); i+=6) {
                String text = lines.get(i);
                String[] options = {lines.get(i+1), lines.get(i+2), lines.get(i+3), lines.get(i+4), lines.get(i+5)};
                String answer = lines.get(i+1);

                /*
                * System.out.println("Adding Question : " + text);
                * System.out.println("Adding Options: " + String.join(", ", options));
                * System.out.println("Correct Answer: " + answer);
                */ 

                // Create a new Question object and add it to the questions list
                Question q = new Question(text, options, answer);
                questions.add(q);
            }    
        } 
        catch (Exception e) {
            System.out.println("Couldn't read file data.txt System Exit");
        }
    }

    // Method to validate user answers against the questions
    public static void validation()
    {
        Scanner in = new Scanner(System.in);

        // Loop until there are no more questions
        while (questions.size() > 0) {
            // Remove the first question from the list
            Question q = questions.remove(0);
            System.out.println(q.question);
            
            // Print the options
            for (int i=0; i<q.options.length; i++) {
                System.out.println(i + ". " + q.options[i]);
            }
            
            // Get user input for the question
            // Validate user input
            int input = in.nextInt();
            if (input < 0 || input > q.options.length-1) {
                System.out.println("Invalid Input");
            }
            
            // Check if the user's answer is correct
            if (q.answer.equals(q.options[input])) {
                System.out.println("Right Answer");
                System.out.println();
            }
            else {
                System.out.println("Wrong Answer");
                System.out.println();
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) 
    {
        read(); // Read questions from the file
        validation(); // Validate user answers
    }    
}
