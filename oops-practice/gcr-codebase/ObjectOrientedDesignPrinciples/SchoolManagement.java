import java.util.*;
class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void viewStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Green Valley School");
        Student aman = new Student("Aman");
        Student ram = new Student("Ram");
        Course math = new Course("Maths");
        Course sci = new Course("Science");
        school.addStudent(aman);
        school.addStudent(ram);
        aman.enrollCourse(math);
        aman.enrollCourse(sci);
        ram.enrollCourse(sci);
        aman.viewCourses();
        ram.viewCourses();
        math.viewStudents();
        sci.viewStudents();
    }
}
