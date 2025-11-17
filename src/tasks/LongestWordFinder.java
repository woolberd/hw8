package tasks;

import java.util.Scanner;

public class LongestWordFinder {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String currentWord = "";
        String longestWord = "";
        int maxLength = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != ' ') {
                currentWord += c;
            } else {
                if (currentWord.length() > maxLength) {
                    longestWord = currentWord;
                    maxLength = currentWord.length();
                }
                currentWord = "";
            }
        }

        if (currentWord.length() > maxLength) {
            longestWord = currentWord;
            maxLength = currentWord.length();
        }

        System.out.println(longestWord);
        System.out.println(maxLength);
    }
}
