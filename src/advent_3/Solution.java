package advent_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strings = readFileToArray("src/advent_3/input.txt");

        long res = 0;
        for (String string : strings) {
            res += getMaxNum(string);
        }

        System.out.println(res);
    }

    private static long getMaxNum(String string) {
        char[] charArray = string.toCharArray();

        String res = "";
        int limit = 12, start = 0;
        while (res.length() != 12) {
            int max = start;
            for (int i = start + 1; i < charArray.length - limit + res.length() + 1; i++) {
                if (charArray[i] > charArray[max])
                    max = i;
            }
            res += charArray[max];
            start = max + 1;
        }
        return Long.parseLong(res);
//        int max = 0;
//        for (int i = 1; i < charArray.length - 1; i++) {
//            if (charArray[i] > charArray[max])
//                max = i;
//        }
//
//        int max2 = max + 1;
//
//        for (int i = max2; i < charArray.length; i++) {
//            if (charArray[i] > charArray[max2])
//                max2 = i;
//        }
//
//        return Integer.parseInt(charArray[max] + "" + charArray[max2]);
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

}
