package advent_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Solution {

    public static HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    public static ArrayList<Integer> counts = new ArrayList<>();
    public static int count = 1;


    public static void main(String[] args) {
        String[] strings = readFileToArray("src/advent_8/example.txt");
        long[][] points = new long[strings.length][3];

        for (int i = 0; i < strings.length; i++) {
            String[] split = strings[i].split(",");

            points[i][0] = Integer.parseInt(split[0]);
            points[i][1] = Integer.parseInt(split[1]);
            points[i][2] = Integer.parseInt(split[2]);
        }

        HashMap<String, Long> distances = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distances.put(i + "," + j, (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]) + (points[i][2] - points[j][2]) * (points[i][2] - points[j][2]));
                list.add(i + "," + j);
            }
        }


        list.sort(Comparator.comparing(distances::get));

        for (String s : list) {
            System.out.println(s + "->" + distances.get(s));
        }
//        int[][] graph = new int[points.length][points.length];


//        for (String s : list) {
//            String[] split = s.split(",");
//            int a = Integer.parseInt(split[0]);
//            int b = Integer.parseInt(split[1]);
//
//            HashSet<Integer> aSet = map.getOrDefault(a, new HashSet<>());
//            HashSet<Integer> bSet = map.getOrDefault(b, new HashSet<>());
//
//            boolean[] visit = new boolean[points.length];
//            if (!checkExist(aSet, a, b, visit)) {
//                aSet.add(b);
//                bSet.add(a);
//                map.put(a, aSet);
//            }
//        }
//        boolean[] visited = new boolean[points.length];
//
//        for (int i = 0; i < points.length; i++) {
//            if (!visited[i]) {
//                dfs(i, visited);
//                counts.add(count);
//            }
//            count = 0;
//        }
//
//        counts.sort(Comparator.comparing(a -> -a));
//
//        System.out.println(counts.get(0) + counts.get(1) + counts.get(2));
    }

    private static void dfs(int i, boolean[] visited) {
        if (visited[i]) return;

        visited[i] = true;

        HashSet<Integer> set = map.getOrDefault(i, new HashSet<>());

        count += set.size();
        for (Integer integer : set) {
            dfs(integer, visited);
        }
    }


    public static boolean checkExist(HashSet<Integer> set, int a, int b, boolean[] visited) {
        if (visited[a]) return false;

        visited[a] = true;

        if (set.contains(b)) {
            return true;
        }
        boolean res = false;
        for (Integer i : set) {
            res = res || checkExist(map.getOrDefault(i, new HashSet<>()), i, b, visited);
        }

        return res;
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
