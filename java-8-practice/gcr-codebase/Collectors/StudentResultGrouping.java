
import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
}

public class StudentResultGrouping {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Aarav", "A"),
            new Student("Diya", "B"),
            new Student("Kabir", "A")
        );

        Map<String, List<String>> result =
            students.stream()
            .collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        System.out.println(result);
    }
}
