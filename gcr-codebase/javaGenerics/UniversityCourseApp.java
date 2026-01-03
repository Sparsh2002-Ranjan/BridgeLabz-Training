import java.util.*;

abstract class CourseType {
    private final String evaluationMethod;

    protected CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    @Override
    public String toString() {
        return evaluationMethod;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based Evaluation");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based Evaluation");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based Evaluation");
    }
}

class Course<T extends CourseType> {
    private final String courseCode;
    private final String courseName;
    private final T courseType;

    public Course(String courseCode, String courseName, T courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " | " + courseType;
    }
}

class UniversityUtil {
    public static void displayCourses(List<? extends CourseType> courseTypes) {
        for (CourseType type : courseTypes) {
            System.out.println(type);
        }
    }
}

public class UniversityCourseApp {
    public static void main(String[] args) {
        Course<ExamCourse> math =
                new Course<>("MTH101", "Calculus", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("CSE201", "Data Structures", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("RES901", "AI Research", new ResearchCourse());

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(math.getCourseType());
        courseTypes.add(cs.getCourseType());
        courseTypes.add(phd.getCourseType());

        UniversityUtil.displayCourses(courseTypes);
    }
}
