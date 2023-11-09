import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is ChatBot Made by Serheu Hryhoriev.");
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
    }
}
