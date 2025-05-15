package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어의 시작이 A 또는 a로 시작하는 단어를 newWords 리스트에 담아 출력하시오.
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");
        List<String> newWords = new ArrayList<>();
        List<String> newWords2 = new ArrayList<>();
        List<String> newWords3 = new ArrayList<>();

        // 1번째 방법
        for (String word : words) {
            if (word.startsWith("A") || word.startsWith("a"))
                newWords.add(word);
        }
        System.out.println(newWords);
        // 2번째 방법
        for (String word : words) {
            char c = word.charAt(0);
            if (c == 'A' || c == 'a') {
                newWords2.add(word);
            }
        }
        System.out.println(newWords2);

        // 3번째 방법
        // case는 대소문자를 의미한다.
        for (String word : words) {
            String firstStr = word.substring(0, 1);
            if (firstStr.equalsIgnoreCase("a")) {
                newWords3.add(word);
            }
        }
        System.out.println(newWords3);

    }
}
