package quizPackage;


public class Question {

    private String question;
    private String[] choices = new String[4];

    public Question(String question, String choice1, String choice2, String choice3, String choice4) {
        this.question = question;
        choices[0] = choice1;
        choices[1] = choice2;
        choices[2] = choice3;
        choices[3] = choice4;
    }

    @Override
    public String toString(){
        return question + "\na)" + choices[0] + "\nb)" + choices[1] + "\nc)" + choices[2] + "\nd)" + choices[3];
    }
}
