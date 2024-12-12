public class Student extends Participant {
    public Student(int id, String email, String name) {
        super(id, email, name);
    }

    @Override
    public void display(){
        System.out.print(getEmail());
        System.out.print(getId());
        System.out.print(getName());
    }
    //comment
}
