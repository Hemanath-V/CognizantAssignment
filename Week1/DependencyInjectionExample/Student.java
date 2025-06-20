package DependencyInjectionExample;

public class Student {
    private Pen pen;


    public Student(Pen pen) {
        this.pen = pen;
    }

    public void writeExam() {
        pen.write();
    }
}

