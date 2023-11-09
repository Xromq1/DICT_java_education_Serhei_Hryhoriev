import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is ChatBot Made by Serhei Hryhoriev.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();

        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want!");

        int userInp = scanner.nextInt();

        for (int i = 1; i <= userInp; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("What does the 'HTML' stand for?");
        System.out.println("1. Hyper Text Markup Language");
        System.out.println("2. Hyper Transfer Markup Language");
        System.out.println("3. Hyperlink and Text Markup Language");
        System.out.println("4. Home Tool Markup Language");

        while (true) {
            int userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                System.out.println("Congratulations! That's correct.");
                break;
            } else {
                System.out.println("Sorry, that's not correct. Please try again.");
            }
        }

        System.out.println("Goodbye, have a nice day!");
    }
}
