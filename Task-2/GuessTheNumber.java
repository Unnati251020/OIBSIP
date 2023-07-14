import java.util.Random;
import javax.swing.JOptionPane;

//Since the user is to be prompted to enter their guessed number in a displayed dialogue box we use methods of JOptionPane class

public class GuessTheNumber {
    public static void main(String[] args) {

        int maxAttempts = 8;               // limiting the number of attempts
        int score = 0;
        int round = 1;

        JOptionPane.showMessageDialog(null, "Welcome to Guess the Number game!");

        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            JOptionPane.showMessageDialog(null, "Round " + round);
            int attemptsLeft = maxAttempts;

            while (attemptsLeft > 0) {
                String input = JOptionPane.showInputDialog("Guess a number between 1 and 100:");
                int guess = Integer.parseInt(input);

                if (guess == randomNumber) {
                    score += attemptsLeft; // Given points based on the number of attempts
                    JOptionPane.showMessageDialog(null, "You guessed the correct number.");
                    break;
                } else if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "The number is higher!");
                } else {
                    JOptionPane.showMessageDialog(null, "The number is lower!");
                }
                attemptsLeft--;
            }
            if (attemptsLeft == 0) {
                JOptionPane.showMessageDialog(null, "Sorry, The correct number was: " + randomNumber);
            }
            int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to continue?");

            if (playAgain == JOptionPane.YES_OPTION) {
                round++;                 // adding more rounds if the user wishes
            } else {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Your final score is: " + score); // displaying score
    }
}