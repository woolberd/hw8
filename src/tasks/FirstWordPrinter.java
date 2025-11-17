package tasks;

import java.util.Scanner;

public class FirstWordPrinter {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstWord = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                break;
            } else {
                firstWord += c;
            }
        }

        System.out.println(firstWord);
    }
}
