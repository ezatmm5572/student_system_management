public class Participant {
    protected String name;
    protected String email;
    protected int id;

    public Participant(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
    public void display(){};
}

