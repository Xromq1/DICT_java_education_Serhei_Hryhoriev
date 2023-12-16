import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] wordList = {"python", "java", "javascript", "kotlin"};

        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);
        String secretWord = wordList[randomIndex];

        int remainingAttempts = 8;
        StringBuilder guessedWord = new StringBuilder("-".repeat(secretWord.length()));
        StringBuilder attemptedLetters = new StringBuilder();

        System.out.println("HANGMAN");
        System.out.println("Type \"play\" to play the game, \"exit\" to quit: ");

        while (remainingAttempts > 0) {
            System.out.println(guessedWord);
            System.out.print("Input a letter: > ");
            Scanner scanner = new Scanner(System.in);
            String playerGuess = scanner.next().toLowerCase();
            if (playerGuess.length() != 1 || !Character.isLowerCase(playerGuess.charAt(0))) {
                System.out.println("You should input a single lowercase English letter");
            } else if (attemptedLetters.toString().contains(playerGuess)) {
                System.out.println("You've already guessed this letter");
            } else if (secretWord.contains(playerGuess)) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == playerGuess.charAt(0)) {
                        guessedWord.setCharAt(i, playerGuess.charAt(0));
                    }
                }
            } else {
                System.out.println("That letter doesn't appear in the word");
                remainingAttempts--;
            }
            attemptedLetters.append(playerGuess);
            if (guessedWord.toString().equals(secretWord) && remainingAttempts > 0) {
                System.out.println("You guessed the word!");
                System.out.println("You survived!");
                break;
            }
        }
        if (remainingAttempts == 0) {
            System.out.println("Type \"play\" to play the game, \"exit\" to quit: ");
        }
    }
}