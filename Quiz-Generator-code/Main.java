import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        // Variable to hold the current quiz
        Scanner in = new Scanner(System.in);
        Quiz quiz = null;

        // Main loop to keep the application running
        while (true) {
            System.out.println();
            System.out.println("Quiz Application");
            System.out.println("1. Create a new quiz");
            System.out.println("2. Add a question to the quiz");
            System.out.println("3. Take the quiz");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            // Consume newline
            int choice = in.nextInt();
            in.nextLine();

            // Switch case to handle user's choice
            switch (choice) {
                case 1:
                    // Create a new quiz
                    // Read quiz title from user
                    System.out.println();
                    System.out.print("Enter quiz title: ");
                    String quiz_name = in.nextLine();

                    // Create a new Quiz object
                    // Read quiz title from user
                    quiz = new Quiz(quiz_name);
                    System.out.println("Quiz created with title: " + quiz_name);
                    break;
                case 2:
                    // Add a question to the quiz
                    // Prompt to create a quiz if not already created
                    if (quiz == null) {
                        System.out.println("Please create a quiz first.");
                        break;
                    }

                    // Read question text from user
                    System.out.println();
                    System.out.print("Enter question text: ");
                    String question = in.nextLine();
                    String[] options = new String[5];

                    // Loop to read the options
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter option " + (i+1) + ": ");
                        options[i] = in.nextLine();
                    }

                    // Read correct answer from user
                    System.out.print("Enter the correct answer: ");
                    String correct_answer = in.nextLine();

                    // Add the question to the quiz
                    // Confirm question addition
                    quiz.addQuestion(new Question(question, options, correct_answer));
                    System.out.println("Question added to the quiz.");
                    break;
                case 3:
                    // Take the quiz
                    // Prompt to create a quiz if not already created
                    if (quiz == null) {
                        System.out.println("Please create a quiz first.");
                        break;
                    }

                    // Start the quiz
                    System.out.println();
                    quiz.takeQuiz();
                    break;
                case 4:
                    // Exit the application
                    // Confirm exit
                    System.out.println("Exiting... Exit");
                    return;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
