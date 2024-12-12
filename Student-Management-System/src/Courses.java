import java.util.ArrayList;
import java.util.List;

public class Courses {
    protected String courseName;
    protected String courseInstructor;
    protected int courseCode;



    public Courses(String courseName, String courseInstructor, int courseCode) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Instructor: " + courseInstructor);
        System.out.println("Course Code: " + courseCode);
    }


    public static void addCourse(List<Courses> courses, Courses newCourse) {
        courses.add(newCourse);
        System.out.println("Course added: " + newCourse.getCourseName());
    }

    public static void editCourse(List<Courses> courses, int courseCode, String newCourseName, String newInstructor) {
        for (Courses course : courses) {
            if (course.getCourseCode() == courseCode) {
                course.setCourseName(newCourseName);
                course.setCourseInstructor(newInstructor);
                System.out.println("Course updated: " + course.getCourseName());
                return;
            }
        }
        System.out.println("Course with Code " + courseCode + " not found.");
    }


    public static void deleteCourse(List<Courses> courses, int courseCode) {
        for (Courses course : courses) {
            if (course.getCourseCode() == courseCode) {
                courses.remove(course);
                System.out.println("Course removed: " + course.getCourseName());
                return;
            }
        }
        System.out.println("Course with Code " + courseCode + " not found.");
    }

    public static void main(String[] args) {
        List<Courses> courses = new ArrayList<>();


        // Displaying courses
        System.out.println("Current Courses:");
        for (Courses course : courses) {
            course.display();
        }

    }

}
