package advent_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strings = readFileSeparatedByComma("src/advent_2/input.txt");
        long res = 0;
        for (String s : strings) {
            int i = s.indexOf('-');
            long first = Long.parseLong(s.substring(0, i));
            long second = Long.parseLong(s.substring(i + 1));

            for (long j = first; j <= second; j++) {
                String s1 = String.valueOf(j);
                if (matchPatten(s1)) {
//                    System.out.println(s1);
                    res += j;
                }
            }
        }

        System.out.println(res);

    }

    public static String[] readFileToArray(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            return lines.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static String[] readFileSeparatedByComma(String filePath) {
        try {
            String content = Files.readString(Path.of(filePath));

            return content.split(",");
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static boolean matchPatten(String s) {
        char c = s.charAt(s.length() - 1);
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (s.charAt(i) == c) {
                String substring = s.substring(0, i + 1);

                if (s.length() % substring.length() == 0) {
                    int j = i + 1;
                    boolean isMatch = true;
                    while (j + substring.length() < charArray.length) {
                        if (!s.substring(j, j + substring.length()).equals(substring)) {
                            isMatch = false;
                            break;
                        }
                        j += substring.length();
                    }

                    if (isMatch && s.endsWith(substring) && s.length() != substring.length()) {
                        System.out.println(substring);
                        System.out.println(s);
                        return true;
                    }
                }

            }
        }
        return false;
    }

}
