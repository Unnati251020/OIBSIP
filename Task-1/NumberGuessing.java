import java.util.Random;
import javax.swing.JOptionPane;

//Since the user is to be prompted to enter their guessed number in a displayed dialogue box we use methods of JOptionPane class

public class NumberGuessing {
    public static void main(String[] args) {

        int maximumAttempts = 8;                 // limiting the number of attempts
        int score = 0;
        int round = 1;

        while (true) {
            Random ranNo = new Random();
            int randomNumber = ranNo.nextInt(100) + 1;
            JOptionPane.showMessageDialog(null, "Let's play the Number Guessing Game!!");
            JOptionPane.showMessageDialog(null, "Round " + round);
            int remainingAttempts = maximumAttempts;

            while (remainingAttempts > 0) {
                String input = JOptionPane.showInputDialog("Pick a number between 1 and 100:");
                int guess = Integer.parseInt(input);

                if (guess == randomNumber) {
                    score += remainingAttempts; // Given points based on the number of attempts
                    JOptionPane.showMessageDialog(null, "You guessed the correct number.");
                    break;
                } else if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "The number is higher!");
                } else {
                    JOptionPane.showMessageDialog(null, "The number is lower!");
                }
                remainingAttempts--;
            }
            if (remainingAttempts == 0) {
                JOptionPane.showMessageDialog(null, "Wrong answer :(  The correct number was:  " + randomNumber);
            }
            int playAgain = JOptionPane.showConfirmDialog(null, "Wanna play more?");

            if (playAgain == JOptionPane.YES_OPTION) {
                round++;                      // adding more rounds if the user wishes
            } else {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Your final score is: " + score); // displaying score
    }
}