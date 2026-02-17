package advent_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strings = readFileToArray("src/advent_3/input.txt");

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
