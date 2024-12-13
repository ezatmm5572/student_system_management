public class Main {
    public static void main(String[] args) {
        Student ezat=new Student(1,"ezat@gmail.com","ezat");
        ezat.display();
        System.out.println("=========================");
        Courses courses=new Courses(new float[]{90, 80, 85},3,new String[]{"cs","database","network"},new String[]{"amr","ahmed","ali"},new int[]{1,2,3});
        courses.display(courses);
        System.out.println("=========================");
        Grade grades=new Grade(new float[]{90,80,85},3);
        grades.total_grades(grades);
    }
}