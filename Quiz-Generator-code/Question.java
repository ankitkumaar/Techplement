public class Question {

    /*
    * The text of the question
    * The options available for the question 
    * The correct answer to the question
     */ 

    public String question;
    public String[] options;
    public String answer;

    // Constructor to initialize a Question object
    public Question(String question, String[] options, String answer) {
        // Initialize all
        this.question = question;
        this.options = options;
        this.answer = options[0];
        
        // Shuffle the options to randomize their order
        for(int i=0; i<options.length; i++) {
            // Generate a random index within the options array
            int random_index = (int)(Math.random() * options.length);

            // Swap the current option with the option at the random index
            String temp = options[i];
            options[i] = options[random_index];
            options[random_index] = temp;
        }
    }
}
