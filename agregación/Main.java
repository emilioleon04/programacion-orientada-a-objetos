import Class;
import Student;

public class Main {
    public static void main(String[] args) {
        
        Class poo = new Class("Poo");
        Student st1 = new Student("Yael", "21");
        Student st2 = new Student("Yael 1", "21");
        Student st3 = new Student("Yael 2", "21");


        poo.addStudent(st1);
        poo.addStudent(st2);
        poo.addStudent(st3);

        poo.listStudents();
    }
}
