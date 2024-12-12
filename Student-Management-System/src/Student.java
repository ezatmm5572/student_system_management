import java.util.ArrayList;
import java.util.List;

public class Student extends Participant {
    private int id;
    private String email;
    private String name;

    public Student( int id,String email, String name) {
        super(id ,email , name);
        this.id = id;
        this.email= email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(getEmail());
        System.out.println(getId());
        System.out.println(getName());
    }



    public static void editStudent(List<Student> students, int id, String newEmail, String newName) {
        for (Student student : students) {
            if (student.getId()==id) {
                student.setEmail(newEmail);
                student.setName(newName);
                System.out.println("Student updated: " + student.getName());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }


    public static void deleteStudent(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student removed: " + student.getName());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();



        System.out.println("Current Students:");
        for (Student student : students) {
            student.display();
        }
    }
}

