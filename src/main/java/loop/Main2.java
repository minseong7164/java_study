package loop;

import javax.naming.Name;
import java.util.List;

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
    this.name = name;
    this.score = score;


    }
}

public class Main2 {

    public static void main(String[] args) {
        // 학생 리스트에서 점수가 85점 이상인 학생들의 이름을 모두 출력하시오.
        List<Student> students = List.of(
                new Student("김준일", 80),
                new Student("김준이", 94),
                new Student("김준삼", 75),
                new Student("김준사", 99),
                new Student("김준오", 85)
        );
        for (Student std : students) {
            if (std.getScore() > 84) {
                System.out.println("85점 이상인 학생 : " + "이름 : " + std.getName() + " 점수 : " + std.getScore());
            }
        }
// Main2에 student 객체 생성, 접근지정자 사용을 해서 get 사용 getName을 통해서 접근함.
    }
}
