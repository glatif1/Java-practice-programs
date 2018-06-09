import java.util.HashMap;

public class Student {
    private HashMap<Course, Double> courseGrades;

    public double getGPA() {
        // return this student's GPA.
    }

    public void addCourseGrade(Course course, Double grade) {
        // add course grade to the hash map
        double tempGrade = courseGrades.get(course);
        if(tempGrade != null){
            courseGrades.put(course, grade);
        }
    }
}
