package tasks;

import java.util.Scanner;

public class StringReplacer_A {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a') {
                result.append('b');
                count++;
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
        System.out.println(count);
    }
}
