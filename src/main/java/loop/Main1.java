package loop;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        // 문자열의 길이가 5이 이상인 단어의 개수를 출력하시오.
        List<String> words = List.of("apple", "cat", "banana", "dog", "grapes");
        List<String> newWords = new ArrayList<>();
//        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > 4) {
//                count++;
            }
            System.out.println(newWords.size());
        }
    }
}
