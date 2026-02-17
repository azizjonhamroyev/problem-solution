package advent_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Advent1 {
    public static void main(String[] args) {
        String[] strings = readFileToArray("src/advent_1/input.txt");
        int curr = 50, res = 0;
        for (String string : strings) {
            int temp = curr;
            int parsed = Integer.parseInt(string.substring(1));
            res += parsed / 100;
            parsed %= 100;
            if (string.charAt(0) == 'R') {
                curr += parsed;
            } else {
                curr -= parsed;
            }
            if (temp != 0 && (curr < 0 || curr > 99) || curr == 0) res++;
            curr = ((curr % 100) + 100) % 100;
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
}
