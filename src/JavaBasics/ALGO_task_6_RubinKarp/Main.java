package JavaBasics.ALGO_task_6_RubinKarp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Alibaba or Alibubab? I do not know!";
        System.out.println(defSearch(text, "b*b"));
    }

    public static String defSearch(String source, String pattern) {
        if (source.length() < pattern.length()) {
            return "Такой подстроки точно нет!";
        }

        List<Integer> found = new ArrayList<>();
        int patternHash = -'*';
        patternHash = sumSymbol(pattern, patternHash);

        int asterikPosition = pattern.indexOf("*");

        for (int i = 0; i < source.length() - pattern.length() - 1; i++) {
            int windowHash = 0;
            if (i == 0) {
                windowHash = sumSymbol(source.substring(0, pattern.length()), windowHash);
                windowHash -= asterikPosition;
            } else {
                windowHash = sumSymbol(source.substring(i, i + pattern.length()), windowHash);
                windowHash -= source.charAt(i + asterikPosition);
            }

            if (windowHash == patternHash) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (pattern.charAt(j) != '*' && source.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    } else {
                        found.add(i);
                    }
                }
            }
            windowHash += source.charAt(i + asterikPosition);
        }
        //return found.toString();
        found = found.stream().distinct().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append("Найдено совпадений в кол-ве ").append(found.size()).append(" шт:\n");
        found.forEach(v -> sb.append("- начиная с позиции - ").append(v).append("\n"));
        return sb.toString();
    }

    public static int sumSymbol(String str, int result) {
        for (byte b : str.getBytes()) {
            result += b;
        }
        return result;
    }
}
