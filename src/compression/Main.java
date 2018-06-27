package compression;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ->");
        String s = in.nextLine();

        int count = 1;

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            char tmp = s.charAt(i-1);
            if (tmp == s.charAt(i)) {
                count++;
                if (i != s.length()-1) continue;
            }

            if (count > 1) {
                builder.append(count);
            }
            builder.append(tmp);

            count = 1;

            if ((i == s.length() - 1) && (tmp != s.charAt(i))) {
                builder.append(s.charAt(i));
            }
        }
        System.out.println(builder);
    }
}
