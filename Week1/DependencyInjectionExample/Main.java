package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Student hemnath = new Student(pen);
        hemnath.writeExam();
    }
}
