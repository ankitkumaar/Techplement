# Techplement

# Week-1 : Quiz Generator

This project is a simple console-based quiz generator written in Java. It reads questions and answers from a text file (`data.txt`) and presents them to the user in a random order. Users can input their answers, and the program will indicate whether the answer is correct or not.

## Features :

- **Read Questions from File**: Reads questions and answers from a text file, making it easy to update and manage quiz content.
- **Randomized Answers**: Randomizes the order of answers for each question to ensure a varied experience each time the quiz is taken.
- **User Interaction**: Allows users to input their answers and provides immediate feedback on whether the answer is correct.
- **Error Handling**: Handles errors gracefully, including file reading errors and invalid user inputs.

## Project Structure :

- **Main.java**: The main entry point of the application. Contains the logic to read the file, present questions, and handle user inputs.
- **Question.java**: Represents a quiz question. Contains the question text, possible answers, and the correct answer.


## Code Explanation :
### `Main.java` :

- **read()**: Reads the `data.txt` file and initializes the list of questions.
- **validation()**: Handles the main loop of the program, presenting questions to the user and checking their answers.
- **main()**: Entry point of the application, calls `read()` and then `validation()`.

### `Question.java` :

- **Constructor**: Initializes a `Question` object with the provided text, options, and answer. Randomizes the order of options.
- **Fields**: Stores the question text, options, and answer.

## Error Handling :

- **File Reading**: If the file cannot be read, the program will print an error message and exit.
- **Invalid Inputs**: If the user inputs an invalid answer (not a valid number or out of range), the program will print an error message and exit.

## Future Enhancements

- **Graphical User Interface (GUI)**: Adding a GUI to make the quiz more interactive and visually appealing.
- **Score Tracking**: Keeping track of the user's score and providing feedback at the end of the quiz.
- **Multiple Quiz Files**: Allowing the user to choose from multiple quiz files.

## Contributions

Contributions are welcome! Feel free to fork the repository and submit a pull request with your changes. Anyone can Run/Folk a public repository, and then submit a pull request that proposes changes to the repository's GitHub Actions workflows. Replit Link : https://replit.com/@ankitkumaar0515/Quiz-Calculator
