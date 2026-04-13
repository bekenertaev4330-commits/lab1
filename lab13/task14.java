import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name;
    }
}

public class Task14 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("A",20,85),
                new Student("B",21,70),
                new Student("C",22,90)
        );

        list.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}