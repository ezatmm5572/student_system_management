import java.util.ArrayList;
import java.util.List;

public class Courses extends Grade{
    protected String[]courseName;
    protected String[]courseInstructor;
    protected int[]courseCode;

    public Courses(float[] grades, int size, String[] courseName, String[] courseInstructor, int[] courseCode) {
        super(grades, size);
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.courseCode = courseCode;
        grades=new float[size];
        courseName=new String[size];
        courseInstructor=new String[size];
        courseCode=new int[size];
    }

    public void display(Courses ob){
        for(int i=0;i<size;i++){
            System.out.println("Code : "+ob.courseCode[i]+" | "+"Course name : "+ob.courseName[i]+" | "+"Course instructive : "+ob.courseInstructor[i]+" | "+"Grade : "+ob.grades[i]);
        }
    }

  //  public static void addCourse(List<Courses> courses, Courses newCourse) {
    //    courses.add(newCourse);
      //  System.out.println("Course added: " + newCourse.getCourseName());
    //}

    //public static void editCourse(List<Courses> courses, int courseCode, String newCourseName, String newInstructor) {
      //  for (Courses course : courses) {
        //    if (course.getCourseCode() == courseCode) {
          //      course.setCourseName(newCourseName);
            //    course.setCourseInstructor(newInstructor);
              //  System.out.println("Course updated: " + course.getCourseName());
                //return;
            //}
        //}
       // System.out.println("Course with Code " + courseCode + " not found.");
    //}


   // public static void deleteCourse(List<Courses> courses, int courseCode) {
     //   for (Courses course : courses) {
       //     if (course.getCourseCode() == courseCode) {
         //       courses.remove(course);
           //     System.out.println("Course removed: " + course.getCourseName());
             //   return;
            //}
       // }
       // System.out.println("Course with Code " + courseCode + " not found.");
   // }

//    public static void main(String[] args) {
  //      List<Courses> courses = new ArrayList<>();


        // Displaying courses
       // System.out.println("Current Courses:");
        //for (Courses course : courses) {
          //  course.display()
        //  }

    //}

}
