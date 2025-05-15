package loop;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 빼고 출력하시오.
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");
//        Set<String> answer1 = new HashSet<>();
//        answer1.addAll(words);
//        System.out.println(answer1);
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            if (newWords.contains(word)) {
                continue;
            }
            newWords.add(word);
        }
        System.out.println(newWords);



    }
}
