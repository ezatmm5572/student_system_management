public class Grade {
protected float[]grades;
protected float size;

    public Grade(float[] grades, int size) {
        this.grades = grades;
        this.size = size;
        grades=new float[size];
    }



    public void display(Grade ob) {
        for (int i=0; i < size; i++) {
            System.out.println(ob.grades[i]);
        }
    }

    public void total_grades(Grade ob){
        float counter=0;
        for (int i=0; i < size; i++){
            counter+=ob.grades[i];
        }
        System.out.println("Total grade : "+counter);
    }
}
