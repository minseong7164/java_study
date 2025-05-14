package generic;

public class Main {
    // 데이터의 타입(data type)을 일반화한다(generalize)는 것을 의미합니다.
    // 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법입니다.
    /*
    와일드카드(?) 의 제약 조건
    1. ? extends 클래스자료형     ->      해당 클래스 자료형의 자식 클래스자료형만 허용
    2. ? super 클래스자료형       ->      해당 클래스 자료형의 부모 클래스자료형만 허용
     */

    public static void showAll(Repository<? extends Student> repository) {
        repository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Repository<HighStudent> hsRepo = new Repository<>();
        Repository<AcademyStudent> asRepo = new Repository<>();

        hsRepo.save(new HighStudent());
        asRepo.save(new AcademyStudent());

        showAll(asRepo);
    }
}
