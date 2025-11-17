package tasks;

import java.util.Scanner;

public class G {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);
    }
}
