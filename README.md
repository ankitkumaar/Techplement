# Techplement

# Week-1 : Quiz Generator

This project is a simple console-based quiz generator written in Java. It allows users to create quizzes, add questions with multiple-choice options, specify correct answers, and take quizzes to test their knowledge. The application provides immediate feedback on the user's answers and keeps track of their score.

## Features :

- **Create Quizzes**: Users can create new quizzes with custom titles.
- **Add Questions**: Users can add multiple-choice questions to the quiz.
- **Randomized Answers**: The order of answers is randomized each time the quiz is taken to ensure a varied experience.
- **Take Quizzes**: Users can take the quiz, input their answers, and receive immediate feedback.
- **Score Tracking**: The application tracks the user's score and provides feedback at the end of the quiz.
- **Error Handling**: Handles errors gracefully, including invalid user inputs.

## Project Structure :

- `Main.java`: The main entry point of the application. Contains the logic to create quizzes, add questions, take quizzes, and handle user inputs.
- `Quiz.java`: Represents a quiz. Contains the quiz title and a list of questions. Provides methods to add questions and take the quiz.
- `Question.java`: Represents a quiz question. Contains the question text, possible answers, and the correct answer.

## Code Explanation :
### `Main.java` :

- **`main(String[] args)`**: The entry point of the application. Presents a menu to the user to create quizzes, add questions, take quizzes, or exit.
  - **Create a new quiz**: Prompts the user to enter a quiz title and creates a new `Quiz` object.
  - **Add a question**: Prompts the user to enter question text, options, and the correct answer, then adds the question to the quiz.
  - **Take the quiz**: Starts the quiz, presenting each question and collecting user answers.
  - **Exit**: Exits the application.

### `Quiz.java` :

- **Fields**:
  - `quiz_name`: The title of the quiz.
  - `questions`: A list of `Question` objects.
- **Constructor**: Initializes the quiz with a title.
- **Methods**:
  - `addQuestion(Question question)`: Adds a question to the quiz.
  - `takeQuiz()`: Interacts with the user to display questions, capture responses, provide feedback, and calculate the score.

### `Question.java` :

- **Fields**:
  - `question`: The text of the question.
  - `options`: An array of possible answers.
  - `answer`: The correct answer.
- **Constructor**: Initializes a `Question` object with the provided text, options, and answer. Randomizes the order of options.
- **Methods**:
  - `getQuestion()`: Returns the question text.
  - `getOptions()`: Returns the options.
  - `getAnswer()`: Returns the correct answer.
  - `checkCorrect(String selected_option)`: Checks if the selected option is correct.

## Error Handling :

- **File Reading**: If the quiz data file cannot be read, the program will print an error message and exit.
- **Invalid Inputs**: If the user inputs an invalid answer (not a valid number or out of range), the program will print an error message and prompt the user to try again.

## Future Enhancements :

- **Graphical User Interface (GUI)**: Adding a GUI to make the quiz more interactive and visually appealing.
- **Score Tracking**: Keeping track of the user's score and providing detailed feedback at the end of the quiz.
- **Multiple Quiz Files**: Allowing the user to choose from multiple quiz files to load different sets of questions.

### Prerequisites :

- Java Development Kit (JDK) installed
- A text editor or IDE for Java development

### Running the Application :

1. Clone the repository: git clone https://github.com/ankitkumaar/Techplement/tree/main/Week1-Tasks/Quiz-Generator-code.git
2. Navigate to the project directory: cd quiz-generator-code
3. Compile the Java files: javac *.java
4. Run the application: java Main

## Contributions :

Contributions are welcome! Feel free to fork the repository and submit a pull request with your changes. Anyone can Run/Folk a public repository, and then submit a pull request that proposes changes to the repository's GitHub Actions workflows. Replit Link : https://replit.com/@ankitkumaar0515/Quiz-Calculator
