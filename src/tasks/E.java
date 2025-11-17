package tasks;

import java.util.Scanner;

public class E {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String lastWord = "";
        int index = input.length() - 1;

        while (index >= 0 && input.charAt(index) == ' ') {
            index--;
        }

        while (index >= 0 && input.charAt(index) != ' ') {
            lastWord = input.charAt(index) + lastWord;
            index--;
        }

        System.out.println(lastWord);
    }
}
